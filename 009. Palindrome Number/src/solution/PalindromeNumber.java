package solution;


public class PalindromeNumber {

	public static void main(String[] args) {
		
		int n = 123321;
		System.out.println(PalindromeNumber.solution(n));

	}
	
	public static boolean solution(int n) {
		// special cases
		// negative numbers cannot be palindrome number.
		// also if the last digit of the number is 0, 
		// the fitst digit of the number should also be 0,
		// only 0 satisfies this property.
		if (n < 0 || (n % 10 == 0 && n != 0)) {
			return false;
		}
		
		int reverse = 0;
		
		while (n > reverse) {
			reverse = reverse * 10 + n % 10;
			n = n / 10;
		}
		
		if (n == reverse || n == reverse / 10) {
			return true;
		}
		return false;
	}

}
