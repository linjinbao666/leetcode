package easy;

import org.omg.CORBA.INTERNAL;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 合并两个有序数组
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * 分析：1.nums1和nums2有序
 *      2.nums1空间足够
 */
public class E88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=0; i<n; i++)nums1[i+m] = nums2[i];
        Arrays.sort(nums1);
        for (int i=0; i<m+n; i++){
            System.out.println(nums1[i]);
        }

    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
    }
}
