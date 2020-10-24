package day01;

/**
 * 485. 最大连续1的个数s
 */

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max =0;
        for(int i=0; i< nums.length; i++){
            if (nums[i]==1) {
                count++;
                max = count>max ?count: max;
            }else {
                count=0;
            }
        }
        return max;
    }
}
