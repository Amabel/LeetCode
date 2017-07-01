package solution;

import java.util.*;
/**
 * @author  Weibin Luo
 * @version Created on 2017/06/26 15:23:55
 */
public class ZigZagConversion {

	public static void main(String[] args) {

		String str = "ABCD";
		System.out.println(new ZigZagConversion().solution_2("PAYPALISHIRING", 3));
	}

	public String solution_1(String s, int numRows) {
		if (null == s || numRows < 1) {
			throw new IllegalArgumentException("s is null or numRows < 1");
		}
		if ("" == s || numRows < 2) {
			return s;
		}

		String ret = "";
		String[] rets = new String[numRows];

		// init
		for (int i=0; i<numRows; i++) {
			rets[i] = "";
		}

		int i = 0;
		while (i < len) {
			for (int idx = 0)
		}

		return ret;
	}

	public String solution_2(String s, int numRows) {
		if (null == s || numRows < 1) {
			throw new IllegalArgumentException("s is null or numRows < 1");
		}
		if ("" == s || numRows < 2) {
			return s;
		}
		char[] ch = s.toCharArray();
		String[] rets = new String[numRows];
		// init
		for (int i=0; i<numRows; i++) {
			rets[i] = "";
		}

		for (int i=0; i<s.length(); i++) {
			int m = i % (numRows - 1);
			int n = i / (numRows - 1);
			if (n % 2 == 0) {
				rets[m] += ch[i];
			} else {
				rets[numRows - m - 1] += ch[i];
			}
		}
		return String.join("", rets);
	}

}
