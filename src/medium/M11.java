package medium;

import annotation.OverHideMethods;

/**
 * 盛最多水的容器
 * 
 * @author linjinbao
 *
 */
public class M11 {
	public static int maxArea(int[] height) {
		int len = height.length;
		if (len < 2)return 0;
		int maxArea = 0;
		int begin =0; 
		int end = len-1;
		while(begin<end) {
			int tmpArea =  (end-begin)*(height[end]>height[begin]?height[begin]:height[end]);
			maxArea = tmpArea > maxArea?tmpArea:maxArea;
			if(height[begin]<height[end])begin++;
			else end--;
		}
		return maxArea;
	}
	
	@OverHideMethods(value="方法一")
	private static int maxArea2(int[] height) {
		int len = height.length;
		if (len < 2)return 0;
		int maxArea = 0;
		for (int i = 0; i < len; i++) {
			int x1 = height[i];
			for (int j = i + 1; j < len; j++) {
				int x2 = height[j];
				maxArea = (x2>x1 ?x1:x2)*(j-i)>maxArea?(x2>x1 ?x1:x2)*(j-i):maxArea;
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int out = maxArea(height);
		System.out.println(out);
	}
}
