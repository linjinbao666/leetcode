package day01;

import java.util.*;

/**
 * 414. 第三大的数
 */
public class ThirdMax {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3) return nums[nums.length-1];
        Set set = new HashSet();
        for (int i= nums.length-1; i>-1; i--){
            if (set.contains(nums[i])) continue;
            else set.add(nums[i]);
            if (set.size()==3) return nums[i];
        }
        return nums[nums.length-1];
    }
}
