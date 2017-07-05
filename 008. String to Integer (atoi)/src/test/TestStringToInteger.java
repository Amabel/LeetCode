package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import com.sun.xml.internal.ws.api.server.AbstractServerAsyncTransport;

import solution.StringToInteger;

public class TestStringToInteger {
	
	StringToInteger sti;

	String str1 = "987";
	int ans1 = 987;
	
	String str2 = "+987";
	int ans2 = 987;
	
	String str3 = "-456";
	int ans3 = -456;
	
	String str4 = "  -7653456";
	int ans4 = -7653456;
	
	String str5 = "  3147483648d3123";
	int ans5 = 2147483647;
	
	String str6 = "   -2147483648";
	int ans6 = -2147483648;
	
	String str7 = " -9999999999";
	int ans7 = -2147483648;
	
	String str8 = "     ";
	int ans8 = 0;
	
	String str9 = "  -sd223";
	int ans9 = 0;
	
	String str10 = null;
	int ans10 = 0;
	
	@Before
	public void setUp() throws Exception {
		sti = new StringToInteger();
	}

	@Test
	public void testSolution_1() {
		assertEquals(ans1, sti.solution_1(str1));
		assertEquals(ans2, sti.solution_1(str2));
		assertEquals(ans3, sti.solution_1(str3));
		assertEquals(ans4, sti.solution_1(str4));
		assertEquals(ans5, sti.solution_1(str5));
		assertEquals(ans6, sti.solution_1(str6));
		assertEquals(ans7, sti.solution_1(str7));
		assertEquals(ans8, sti.solution_1(str8));
		assertEquals(ans9, sti.solution_1(str9));
		assertEquals(ans10, sti.solution_1(str10));
	}

}
