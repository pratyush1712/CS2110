package a1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PhDTest {

	@Test
	void testA() {
		PhD p1 = new PhD("Alex John", 2005, 7);
		assertEquals("Alex John", p1.name());
		assertEquals("7/2005", p1.date());
	}
	
	@Test
	void testB() {
		
	}
	
	@Test
	void testC() {

	}
	
	@Test
	void testD() {
		
	}

}
