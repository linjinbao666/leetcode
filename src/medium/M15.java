package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import annotation.OverHideMethods;

/**
   *  三数之和
 * 
 * @author linjinbao
 *
 */
public class M15 {
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		int len = nums.length;
		if(len<3) return list;
		for(int i=0; i<len; i++) {
			if(nums[i] > 0) return list;
			if(i>0 && nums[i]==nums[i-1]) continue;
			int l = i+1;
			int r = len-1;
			while(l < r) {
				int sum  = nums[i]+nums[l]+nums[r];
				if(sum == 0) {
					list.add(Arrays.asList(nums[i],nums[l], nums[r]));
					while(l<r && nums[l]==nums[l+1]) l++;
					while(l<r && nums[r]==nums[r-1]) r--;
					l++;
					r--;
				}
				else if(sum<0) l++;
				else if(sum>0) r--;
			}
		}
		return list;
	}
	
	@OverHideMethods(value = { "错误" })
	private static List<List<Integer>> simple1(int[] nums) {
		int len = nums.length;
		if(len<=3) return null;
		List<List<Integer>> list = new ArrayList<>();
		for(int i=0; i<len; i++) {
			int tmp1 = nums[i];
			for(int j=0; j<len; j++) {
				int tmp2 = nums[j];
				for(int k=0; k<len; k++) {
					int tmp3 = nums[k];
					if(tmp1+tmp2+tmp3 == 0) {
						List<Integer> tmpList = new ArrayList();
						tmpList.add(tmp1);
						tmpList.add(tmp2);
						tmpList.add(tmp3);
						list.add(tmpList);
					}
				}
			}
		}
		return list;
	}
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> out = threeSum(nums);
		System.out.println(out);
	}
}
