package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 求众数
 */
public class E169 {
    public static int majorityElement(int[] nums) {
        int len = nums.length;
        if (len==1) return nums[0];
        int target = len/2;
        if (len<=2) return nums[0];
        Map<Integer, Integer> map = new HashMap();
        for (int i=0; i<len; i++){
            if (!map.containsKey(nums[i])) map.put(nums[i],1);
            else {
                int value = map.get(nums[i])+1;
                if (value>target) return nums[i];
                map.put(nums[i],value);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int out = majorityElement(nums);
        System.out.println(out);
    }
}
