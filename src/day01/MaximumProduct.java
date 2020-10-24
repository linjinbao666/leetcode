package day01;


import java.util.Arrays;

/**
 * 628. 三个数的最大乘积
 */

public class MaximumProduct {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        if (nums[nums.length-1]<=0 || nums[0]>=0) return nums[nums.length-3] * nums[nums.length-2] * nums[nums.length-1];
        return Math.max(nums[0]*nums[1]*nums[nums.length-1], nums[nums.length-3] * nums[nums.length-2] * nums[nums.length-1]);
    }
}
