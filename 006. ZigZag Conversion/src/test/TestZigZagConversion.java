package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import solution.ZigZagConversion;

public class TestZigZagConversion {
	
	ZigZagConversion zzc;
	
	TestCase t1 = new TestCase("ABCDE", 3);
	String a1 = "AEBDC";
	TestCase t2 = new TestCase("ABCDE", 2);
	String a2 = "ACEBD";
	TestCase t3 = new TestCase("PAYPALISHIRING", 3);
	String a3 = "PAHNAPLSIIGYIR";
	TestCase t4 = new TestCase("PAYPALISHIRING", 1);
	String a4 = "PAYPALISHIRING";
	TestCase t5 = new TestCase("", 1);
	String a5 = "";
	TestCase t6 = new TestCase(null, 1);
	TestCase t7 = new TestCase("ABC", 0);
	
	

	@Before
	public void setUp() throws Exception {
		zzc = new ZigZagConversion();
	}

	@Test (expected = IllegalArgumentException.class)
	public void testSolution_2() {
		
		assertEquals(a1, zzc.solution_2(t1.str, t1.lines));
		assertEquals(a2, zzc.solution_2(t2.str, t2.lines));
		assertEquals(a3, zzc.solution_2(t3.str, t3.lines));
		assertEquals(a4, zzc.solution_2(t4.str, t4.lines));
		assertEquals(a5, zzc.solution_2(t5.str, t5.lines));
		zzc.solution_2(t6.str, t6.lines);
		zzc.solution_2(t7.str, t7.lines);

	}

	class TestCase {
		String str;
		int lines;
		
		public TestCase(String str, int lines) {
			super();
			this.str = str;
			this.lines = lines;
		}
	}
}
