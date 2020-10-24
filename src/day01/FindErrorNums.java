package day01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 645. 错误的集合
 */
public class FindErrorNums {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int sum1 = (1+nums.length)*nums.length/2;
        int sum2 = Arrays.stream(nums).sum();
        Set set = new HashSet<>();
        int repeat = 0;
        for (int i=0; i<nums.length; i++){
            if (!set.contains(nums[i])) set.add(nums[i]);
            else {
                repeat = nums[i];
                break;
            }
        }
        int p = sum1 - sum2;
        for(int i=0; i<nums.length; i++){
            if (i+1!= nums[i]) return new int[]{repeat, repeat+p};
        }
        return null;
    }
}
