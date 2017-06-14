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
	// 2个指针，最多遍历两次字符串
	public int solution_2(String s) {
		if (s == null) {
			throw new IllegalArgumentException("string is null!");
		}
		// 使用一个长度为 256 的 boolean 数组来记录字符的出现情况
		boolean[] exist = new boolean[256];
		int i= 0;
		int maxLen = 0;
		for (int j=0; j<s.length(); j++) {
			// 如果该字符已经出现，则要把 i 向右移 1 位
			// 注意此处不可以把 i 直接指向 j 右边的位置
			if (exist[s.charAt(j)]) {
				exist[s.charAt(j)] = false;
				i ++;
			}
			exist[s.charAt(j)] = true;
			maxLen = Math.max(j -i + 1, maxLen);
		}
		return maxLen;
	}

	// approach 3
	// 2个指针，遍历一次字符串
	public int solution_3(String s) {
		if (s == null) {
			throw new IllegalArgumentException("string is null!");
		}
		// 使用 int 数组来记录每个字符出现的位置
		int[] charMap = new int[256];
		Arrays.fill(charMap, -1);
		int i = 0;
		int maxLen= 0;
		// 每次更新字符出现的位置，若该字符已经出现过
		// 就将 i 移动到上一次该字符出现的位置 + 1
		for (int j=0; j<s.length(); j++) {
			if (charMap[s.charAt(j)] >= i) {
				i = charMap[s.charAt(j)] + 1;
			}
			charMap[s.charAt(j)] = j;
			maxLen = Math.max(j - i + 1, maxLen);
		}
		return maxLen;
	}
	
	// approach 4
    public int solution_4(String s) {
    	if (s == null) {
			throw new IllegalArgumentException("string is null!");
		}
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
    
    // approach 5
    public int solution_5(String s) {
    	if (s == null) {
			throw new IllegalArgumentException("string is null!");
		}
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

}
