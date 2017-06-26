package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import solutions.ReverseInteger;
import sun.awt.motif.X11CNS11643;
import sun.security.x509.X500Name;

/**
 * @author  Weibin Luo
 * @version Created on 2017/06/26 14:23:07
 */
public class TestReverseInteger {

	ReverseInteger ri;
	
	int x1 = 0;
	int a1 = 0;
	
	int x2 = 1;
	int a2 = 1;
	
	int x3 = 10;
	int a3 = 1;
	
	int x4 = 10300;
	int a4 = 301;
	
	int x5 = 2147483641;
	int a5 = 1463847412;
	
	// overflow
	int x6 = 2147483647;
	int a6 = 0;
	
	@Before
	public void setUp() throws Exception {
		ri = new ReverseInteger();
	}

	@Test
	public void testSolution_1() {
		assertEquals(a1, ri.solution_1(x1));
		assertEquals(a2, ri.solution_1(x2));
		assertEquals(a3, ri.solution_1(x3));
		assertEquals(a4, ri.solution_1(x4));
		assertEquals(a5, ri.solution_1(x5));
		assertEquals(a6, ri.solution_1(x6));
	}

	@Test
	public void testSolution_2() {
		assertEquals(a1, ri.solution_2(x1));
		assertEquals(a2, ri.solution_2(x2));
		assertEquals(a3, ri.solution_2(x3));
		assertEquals(a4, ri.solution_2(x4));
		assertEquals(a5, ri.solution_2(x5));
		assertEquals(a6, ri.solution_2(x6));
	}

}
