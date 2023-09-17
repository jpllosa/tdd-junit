package com.blogspot.jpllosa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MathFunTest {
	
	@Test
	public void testWithTwoPositiveNumbers( ) {
		MathFun mf = new MathFun();
		
		assertEquals(4, mf.getGCF(12, 16));
	}
	
	@Test
	public void testWithZero( ) {
		MathFun mf = new MathFun();
		
		assertEquals(6, mf.getGCF(0, 6));
	}
	
//	@Test
//	public void testThatFails() {
//		fail("Not yet implemented");
//	}

}
