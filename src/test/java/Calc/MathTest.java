package Calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathTest {

	@Test
	void test1() {
		Math m = new Math();
		System.out.println(m.add(2, 3));
		assertEquals(5, m.add(2, 3));
	}
	
	@Test
	void test2() {
		Math m = new Math();
		System.out.println(m.add(3, 3));
		assertEquals(6, m.add(3, 3));
	}

}
