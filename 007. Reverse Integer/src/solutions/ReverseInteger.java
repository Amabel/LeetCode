package solutions;

public class ReverseInteger {

	public static void main(String[] args) {
		int x = -1123;
		int res = new ReverseInteger().solution_1(x);
		System.out.println(res);
	}

	public int solution_1(int x) {
		int ret = 0;

		while (0 != x) {
			// overflow
			if (Math.abs(ret) > 214748364) {
				return 0;
			}
			ret = ret * 10 + (x % 10);
			x = x / 10;
		}

		return ret;
	}
}
