package a1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PhDTest {

	@Test
	void testConstructor1() {
		PhD p1 = new PhD("Alex John", 2005, 7);
		assertEquals("Alex John", p1.name());
		assertEquals("7/2005", p1.date());
		assertEquals(null, p1.advisor1());
		assertEquals(null, p1.advisor2());
		assertEquals(0, p1.advisees());
		
		//testing assert statements for Group A
		assertThrows(AssertionError.class, () -> {new PhD(null, 1972, 7);});
		assertThrows(AssertionError.class, () -> {new PhD("", 1972, 7);});
		assertThrows(AssertionError.class, () -> {new PhD("Alex John", 1972, 0);});
		assertThrows(AssertionError.class, () -> {new PhD("Alex John", 1972, 15);});
		
		
	}
	
	@Test
	void testMutators() {
		PhD p1 = new PhD("Alex John", 2005, 7);
		PhD p2 = new PhD("Tim Boseman", 1985, 7);
		PhD p3 = new PhD("Alex Shaun", 1994, 10);
		p1.addAdvisor1(p2);
		assertEquals(p2, p1.advisor1());
		assertEquals(1, p2.advisees());
		p1.addAdvisor2(p3);
		assertEquals(p3, p1.advisor2());
		assertEquals(1, p3.advisees());
		assertEquals(0, p1.advisees());
		
		//testing assert statements for Group B
		PhD p4 = new PhD("Alex Smith", 1950, 11);
		assertThrows(AssertionError.class, () -> {p1.addAdvisor1(p4);});
		assertThrows(AssertionError.class, () -> {p2.addAdvisor1(null);});
		assertThrows(AssertionError.class, () -> {p3.addAdvisor2(p4);});
		assertThrows(AssertionError.class, () -> {p.addAdvisor1(p4);});



	}
	
	@Test
	void testConstructor2() {
		PhD p2 = new PhD("Tim Boseman", 1985, 7);
		PhD p3 = new PhD("Alex John", 1994, 10);
		PhD p1 = new PhD("Alex Shaun", 2005, 7, p3, p2);
		assertEquals("Alex Shaun", p1.name());
		assertEquals("7/2005", p1.date());
		assertEquals(p2, p1.advisor2());
		assertEquals(p3, p1.advisor1());
		assertEquals(1, p2.advisees());
		assertEquals(1, p3.advisees());
		
		
	}
	
	@Test
	void testGroupD() {
		
	}
	
	
	@Test
	void testAssertStatements() {
		
		//testing assert statements for Group A
		assertThrows(AssertionError.class, () -> {new PhD(null, 1972, 7);});
		assertThrows(AssertionError.class, () -> {new PhD("", 1972, 7);});
		assertThrows(AssertionError.class, () -> {new PhD("Alex John", 1972, 0);});
		assertThrows(AssertionError.class, () -> {new PhD("Alex John", 1972, 15);});
		
		//testing assert statements for Group B
		assertThrows(AssertionError.class, () -> {
			PhD p1 = new PhD("Timothy Smith", 1980, 7);
			p1.addAdvisor1(null);
		});
		
	}

}
