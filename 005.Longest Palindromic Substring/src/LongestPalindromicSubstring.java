
public class LongestPalindromicSubstring {

	private static int lo;
	private static int maxLen;
	
	public static void main(String[] args) {
		String s = "abba";
		System.out.println(LongestPalindromicSubstring.solution(s));
	}
	
	public static String solution(String s) {
		lo = 0;
		maxLen = 0;
		
		int len = s.length();
		if (len < 2) {
			return s;
		}
		
		for (int i=0; i<len-1; i++) {
			extendPalindrome(s, i, i); // odd length
			extendPalindrome(s, i, i + 1); // even length
		}
		return s.substring(lo, lo + maxLen);
	}
	
	private static void extendPalindrome(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left --;
			right ++;
		}
		
		if (maxLen < right - left - 1) {
			// update maxLen
			maxLen = right - left - 1;
			// start index
			lo = left + 1;
		}
	}

}
