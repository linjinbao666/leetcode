package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * ����֮��
 * @author linjinbao
 *
 */
public class E1 {
	public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
		Map<Integer, Integer> map = new HashMap<>();	//ֵ+ �±�
		for(int i=0; i<len; i++) {
			if(!map.containsValue(i) && map.containsKey(target-nums[i])) 
				return new int[] {map.get(target-nums[i]), i};
			map.put(nums[i], i);
		}
		return null;
    }
	
	public static void main(String[] args) {
		int[] nums = {3,3};
		int out[] = twoSum(nums, 6);
		for(int i: out) {
			System.out.println(i);
		}
	}
}
