package easy;

import java.util.Arrays;

/**
 * 缺失数字
 * [9,6,4,2,3,5,7,0,1]
 */
public class E268 {
    public static int missingNumber(int[] nums) {
        int len = nums.length;
        int sum1 = (1+len)*len/2;
        int sum2 = 0;
        for (int i=0; i<len; i++){
            sum2+=nums[i];
        }
        return sum1-sum2;
    }

    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int out = missingNumber(nums);
        System.out.println(out);
    }
}
