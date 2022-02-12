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
		p2.addAdvisor1(p3);
		
		//testing assert statements for Group B
		PhD p4 = new PhD("Alex Smith", 1950, 11);
		assertThrows(AssertionError.class, () -> {p1.addAdvisor1(p4);});
		assertThrows(AssertionError.class, () -> {p2.addAdvisor1(null);});
		assertThrows(AssertionError.class, () -> {p3.addAdvisor2(p4);});
		assertThrows(AssertionError.class, () -> {p1.addAdvisor2(p4);});
		assertThrows(AssertionError.class, () -> {p2.addAdvisor2(null);});
		assertThrows(AssertionError.class, () -> {p2.addAdvisor2(p3);});

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
		
	        //testing assert statements for Group C
		assertThrows(AssertionError.class, () -> {new PhD(null, 1972, 7, p1, p2);});
		assertThrows(AssertionError.class, () -> {new PhD("", 1972, 7, p1, p2);});
		assertThrows(AssertionError.class, () -> {new PhD("Alex John", 1972, 0, p1, p2);});
		assertThrows(AssertionError.class, () -> {new PhD("Alex John", 1972, 15, p1, p2);});
	        assertThrows(AssertionError.class, () -> {new PhD("Alex John", 1972, 7, null, p2);});
		assertThrows(AssertionError.class, () -> {new PhD("Alex John", 1972, 7, p1, null);});
		assertThrows(AssertionError.class, () -> {new PhD("Alex John", 1972, 7, p1, p1);});
		
	}
	
	@Test
	void testD() {
		// tests for gotBefore
		PhD April2020 = new PhD("April2020", 2020, 4);
		PhD April20201 = new PhD("April20201", 2020, 4);
		assertEquals(false, April2020.gotBefore(April20201));
		assertEquals(false, April2020.gotBefore(April2020));
		PhD April2021 = new PhD("April2021", 2021, 4);
		assertEquals(true, April2020.gotBefore(April2021));
		assertEquals(false, April2021.gotBefore(April2020));
		PhD May2021 = new PhD("May2021", 2021, 5);
		assertEquals(true, April2021.gotBefore(May2021));
		assertEquals(false, May2021.gotBefore(April2021));
		PhD Jan2022 = new PhD("Jan2022", 2022, 1);
		assertEquals(false, Jan2022.gotBefore(April2021));
		assertEquals(true, April2021.gotBefore(Jan2022));
		PhD Dec1980 = new PhD("Dec1980", 1980, 12);
		assertEquals(false, April2021.gotBefore(Dec1980));
		assertEquals(true, Dec1980.gotBefore(April2021));
		
		// tests for 
		
		//testing assert statements for Group D
		
	}
	
	
}
