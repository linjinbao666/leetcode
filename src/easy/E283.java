package easy;

import annotation.OverHideMethods;

/**
 * 移动零
 * [0,1,0,3,12]
 * [1,3,12,0,0]
 */
public class E283 {
    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        for (int i=0; i<len-1; i++){
            if (nums[i]==0){
                for (int j=i+1; j<len; j++){
                    if (nums[j]!=0){
                        nums[i] = nums[j];
                        nums[j] =0;
                        break;
                    }
                }
            }
        }
    }

    @OverHideMethods("超时")
    private static void aa(int[] nums) {
        int len = nums.length;
        int count = 0;
        for (int i=0; i<len-1; i++){
            int tmp1 = nums[i];
            if (tmp1!=0) continue;
            for (int j=i; j<len-i-1; j++){
                nums[j] = nums[j+1];
            }
            i--;
            count++;
        }
        for (int i=len-count; i<len; i++){
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,0};
        moveZeroes(nums);
        for (int num :nums){
            System.out.println(num);
        }
    }
}
