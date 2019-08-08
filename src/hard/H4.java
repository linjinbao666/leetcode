package hard;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * 寻找两个有序数组的中位数
 */
public class H4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 =nums2.length;
        if (len1==0) return (double) len2/2;
        if (len2==0) return (double) len1/2;
        int targetIndex = (len1+len2)%2==0 ? (len1+len2)/2 : (len1+len2)/2+1;
        int[] nums3 = new int[len1+len2];
        int i=0;
        int j=0;
        int k=0;
        while (i<len1 || j<len2){
            if (i>=len1) {
                nums3[k] = nums2[j];
                if (j==targetIndex) return nums2[j];
                j++;
                k++;
            }else if (j>=len2) {
                nums3[k] = nums1[i];
                if (i==targetIndex) return nums1[i];
                i++;
                k++;
            }else {
                nums3[k] = nums1[i]<nums2[j]?nums1[i]:nums2[j];
                if (k==targetIndex) return nums3[k];
                i++;
                j++;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double out = findMedianSortedArrays(nums1,nums2);
        System.out.println(out);
    }
}
