package medium;

import annotation.OverHideMethods;

import java.util.Arrays;

/**
 * 最接近的三数之和
 */
public class M16 {
    //-4 -1 1 2 ->1
    // -3 0 1 2   ->1
    public static void main(String[] args) {
        int[] nums = {1,1,1,0};

        int out = threeSumClosest(nums,100);
        System.out.println(out);

    }

    public static int threeSumClosest(int[] nums, int target) {
        if (nums.length<3) return 0;
        //先排序 -4 -1 1 2     target=1
        Arrays.sort(nums);
        int sum = nums[0]+nums[1]+nums[2];
        for (int i=0; i<nums.length-2; i++){
            sum = nums[i]+nums[i+1]+nums[i+2];
            //sum >= target
            if (sum >= target) return sum;
            //sum < target
            for (int j=i+3; j<nums.length; j++){
                int tmpSum = nums[i] + nums[i+1] + nums[j];
                if (tmpSum >= target) return tmpSum-target<=target-sum ? tmpSum : sum;
                //sum < tmpSum < target
               sum = tmpSum;
            }

        }
        return sum;
    }



}
