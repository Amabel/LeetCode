package solutions;

import java.util.*;

/**
 * @author  Weibin Luo
 * @version Created on 2017/06/12 14:41:12
 */
public class LongestSubstingWithoutRepeatingCharacters {

	public static void main(String[] args) {


	}

	// approach 1
	// 列出所有子字符串并判断是否有重复的字符，
	// 若没有重复的字符，计算长度并更新最大值
	public int solution_1(String s) {
		if (s == null) {
			throw new IllegalArgumentException("string is null!");
		}

		int n = s.length();
        int ans = 0;
        // 列出所有的子字符串并判断其中是否有重复的字符
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                // 若该子字符串中没有重复的字符，则记录长度并更新长度的最大值
                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
        return ans;
	}
	// 用于判断字符串中是否有重复的字符
    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }

	// approach 2
	// 2个指针，遍历一次字符串
	public int solution_2(String s) {
		if (s == null) {
			throw new IllegalArgumentException("string is null!");
		}

		boolean[] exist = new boolean[256];
		int i= 0;
		int maxLen = 0;

		for (int j=0; j<s.length(); j++) {
			if (exist[s.charAt(j)]) {
				exist[s.charAt(j)] = false;
				i ++;
			}
			exist[s.charAt(j)] = true;
			maxLen = Math.max(j -i + 1, maxLen);
		}
		return maxLen;
	}

}
