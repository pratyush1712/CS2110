package a1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PhDTest {

	@Test
	void testGroupA() {
		PhD p1 = new PhD("Alex John", 2005, 7);
		assertEquals("Alex John", p1.name());
		assertEquals("7/2005", p1.date());
		assertEquals(null, p1.advisor1());
		assertEquals(null, p1.advisor2());
		assertEquals(0, p1.advisees());
	}
	
	@Test
	void testGroupB() {
		PhD p1 = new PhD("Alex John", 2005, 7);
		PhD p2 = new PhD("Tim Boseman", 1985, 7);
		PhD p3 = new PhD("Alex Shaun", 1994, 10);
		p1.addAdvisor1(p2);
		assertEquals(p2, p1.advisor1());
		assertEquals(1, p2.advisees());
		p1.addAdvisor2(p3);
		assertEquals(p3, p1.advisor2());
		assertEquals(1, p3.advisor1());
	}
	
	@Test
	void testGroupC() {
		PhD p2 = new PhD("Tim Boseman", 1985, 7);
		PhD p3 = new PhD("Alex John", 1994, 10);
		PhD p1 = new PhD("Alex Shaun", 2005, 7, p3, p2);
		assertEquals(p2, p1.advisor2());
		assertEquals(p3, p1.advisor1());
		assertEquals(1, p2.advisees());
		assertEquals(1, p3.advisees());
	}
	
	@Test
	void testGroupD() {
		PhD p1 = new PhD("Max Planck", 1946, 8);
		PhD p2 = new PhD("Albert Einstein", 1905, 9);
		assertEquals(true, p2.gotBefore(p1));
		assertEquals(false, p1.gotBefore(p2));
		
		PhD p3 = new PhD("Caleb John", 1947, 8);
		PhD p4 = new PhD("Robert Brady", 1947, 7);
		assertEquals(true, p4.gotBefore(p3));
		assertEquals(false, p3.gotBefore(p4));
		
		PhD p5 = new PhD("John Smith", 2002, 8, p1, p2);
		PhD p6 = new PhD("John Geller", 2004, 6, p3, p4);
		PhD p7 = new PhD("John Kennedy", 2005, 5, p1, p4);
		assertEquals(false, p5.isSiblingOf(p6));
		assertEquals(false, p6.isSiblingOf(p7));
		assertEquals(true, p5.isSiblingOf(p7));
		assertEquals(true, p6.isSiblingOf(p7));
		assertEquals(false, p5.isSiblingOf(p5));

	}
	
	@Test
	void testAssertStatements() {
		
	}
	
	

}
