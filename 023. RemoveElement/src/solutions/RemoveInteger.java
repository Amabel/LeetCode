package solutions;
/**
 * @author  Weibin Luo
 * @version Created on Jan 15, 2018 3:03:44 PM
 */
public class RemoveInteger {

	public static void main(String[] args) {
		
		RemoveInteger ri = new RemoveInteger();
		int[] nums = {1, 0, 0, 3, 4};
		int val = 2;
		
		System.out.println(ri.solution(nums, val));

	}
	
	public int solution(int[] nums, int val) {
		int len = nums.length;
		for (int i=0; i<len; i++) {
			// 若当前元素等于需要移除的元素 则用数组末尾的元素替换当前的元素
			// 此处不可用 if 因为需要应对末尾元素也等于需要移除的元素的情况
			// while 中也需要判断边界 i < len
			while (nums[i] == val && i < len) {
				len --;
				nums[i] = nums[len];
			}
		}
		return len;
	}
}
