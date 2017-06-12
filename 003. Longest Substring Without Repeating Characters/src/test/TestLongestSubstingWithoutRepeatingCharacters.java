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
	
	@Before
	public void setUp() throws Exception {
		ls = new LongestSubstingWithoutRepeatingCharacters();
	}

	@Test (expected = IllegalArgumentException.class)
	public void testSolution_1() {
		
		ls.solution_1(str1);
		assertEquals(ans2, ls.solution_1(str2));
		assertEquals(ans3, ls.solution_1(str3));
		assertEquals(ans4, ls.solution_1(str4));
		assertEquals(ans5, ls.solution_1(str5));

	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testSolution_2() {
		
		ls.solution_2(str1);
		assertEquals(ans2, ls.solution_2(str2));
		assertEquals(ans3, ls.solution_2(str3));
		assertEquals(ans4, ls.solution_2(str4));
		assertEquals(ans5, ls.solution_2(str5));

	}

}
