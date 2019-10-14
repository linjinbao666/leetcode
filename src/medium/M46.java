package medium;

import java.util.*;

/**
 * 全排列
 * [1,2,3]
 */
public class M46 {
    public static List<List<Integer>> permute(int[] nums) {
        if (nums.length==0) return null;

        Set<Integer> set = new HashSet<>();
        for (int i=0; i< nums.length; i++)set.add(nums[i]);

        int len = helper(nums.length);
        List<List<Integer>>  lists = new ArrayList<>();




        return lists;
    }

    public static int helper(int n){
        if (n==0) return 1;
        return n*helper(n-1);
    }


    public static void main(String[] args){

    }
}
