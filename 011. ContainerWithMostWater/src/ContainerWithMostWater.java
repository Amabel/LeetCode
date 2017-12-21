
public class ContainerWithMostWater {

	public static void main(String[] args) {
		
		int[] height = {1,0,0,0,0,0,3,0,0,10};
		
		System.out.println(ContainerWithMostWater.solution(height));

	}
	
	public static int solution(int[] height) {
		
		if (height == null || height.length == 0) {
			System.out.println("wrong height");
			return -1;
		}
		
		int i = 0;
		int j = height.length - 1;
		int maxArea = 0;
		
		while (i < j) {
			int a = 0;
			int b = j - i;
			if (height[i] < height[j]) {
				a = height[i];
				i ++;
			} else {
				a = height[j];
				j --;
			}
			int currentArea = a * b;
			if (currentArea > maxArea) {
				maxArea = currentArea;
			}
		}
		
		return maxArea;
		
	}

}
