package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import solutions.LongestSubstingWithoutRepeatingCharacters;

/**
 * @author  Weibin Luo
 * @version Created on 2017/06/12 14:56:40
 */
public class TestLongestSubstingWithoutRepeatingCharacters {

	LongestSubstingWithoutRepeatingCharacters ls;
	
	String str1 = null;
	
	String str2 = "";
	int ans2 = 0;
	
	String str3 = "abcabcbb";
	int ans3 = 3;
	
	String str4 = "bbbbbb";
	int ans4 = 1;
	
	String str5 = "dfjiomn$)'% &";
	int ans5 = 13;
	
	String str6 = "abcad";
	int ans6 = 4;
	
	@Before
	public void setUp() throws Exception {
		ls = new LongestSubstingWithoutRepeatingCharacters();
	}

	@Test (expected = IllegalArgumentException.class)
	public void testSolution_1() {
		
		assertEquals(ans2, ls.solution_1(str2));
		assertEquals(ans3, ls.solution_1(str3));
		assertEquals(ans4, ls.solution_1(str4));
		assertEquals(ans5, ls.solution_1(str5));
		assertEquals(ans6, ls.solution_1(str6));
		ls.solution_1(str1);

	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testSolution_2() {
		
		assertEquals(ans2, ls.solution_2(str2));
		assertEquals(ans3, ls.solution_2(str3));
		assertEquals(ans4, ls.solution_2(str4));
		assertEquals(ans5, ls.solution_2(str5));
		assertEquals(ans6, ls.solution_2(str6));
		ls.solution_2(str1);

	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testSolution_3() {
		
		assertEquals(ans2, ls.solution_3(str2));
		assertEquals(ans3, ls.solution_3(str3));
		assertEquals(ans4, ls.solution_3(str4));
		assertEquals(ans5, ls.solution_3(str5));
		assertEquals(ans6, ls.solution_3(str6));
		ls.solution_3(str1);

	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testSolution_4() {
		
		assertEquals(ans2, ls.solution_4(str2));
		assertEquals(ans3, ls.solution_4(str3));
		assertEquals(ans4, ls.solution_4(str4));
		assertEquals(ans5, ls.solution_4(str5));
		assertEquals(ans6, ls.solution_4(str6));
		ls.solution_4(str1);

	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testSolution_5() {
		
		assertEquals(ans2, ls.solution_5(str2));
		assertEquals(ans3, ls.solution_5(str3));
		assertEquals(ans4, ls.solution_5(str4));
		assertEquals(ans5, ls.solution_5(str5));
		assertEquals(ans6, ls.solution_5(str6));
		ls.solution_5(str1);

	}
	
	

}
