package hard;


/**
 * 寻找两个有序数组的中位数
 */
public class H4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 =nums2.length;
        int len3 = len1+len2;
        int[] nums3 = new int[len3];       //新数组
        if (len1==0) return len2%2==0 ? (nums2[len2/2-1]+nums2[len2/2])/2.0 : nums2[len2/2];
        if (len2==0) return len1%2==0 ? (nums1[len1/2-1]+nums1[len1/2])/2.0 : nums1[len1/2];
        int i=0,j=0,k=0;
        if (len3 %2 ==0){
            while (i < len1 || j < len2){
                if (i==len1) {
                    nums3[k] = nums2[j];
                    j++;
                }else if (j==len2){
                    nums3[k] = nums1[i];
                    i++;
                }else if (nums1[i]< nums2[j]){
                    nums3[k] = nums1[i];
                    i++;
                }else {
                    nums3[k] = nums2[j];
                    j++;
                }
                if (k == len3/2) return (nums3[k]+nums3[k-1]) / 2.0;
                k++;
            }
        }else {
            while (i<len1 || j<len2){
                if (i==len1){
                    nums3[k] = nums2[j];
                    j++;
                }else if (j==len2){
                    nums3[k] = nums1[i];
                    i++;
                }else if (nums1[i]< nums2[j]){
                    nums3[k] = nums1[i];
                    i++;
                }else {
                    nums3[k] = nums2[j];
                    j++;
                }
                if (k == len3/2) return nums3[k];
                k++;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] nums2 = {1,3};
        int[] nums1 = {2};
        double out = findMedianSortedArrays(nums1,nums2);
        System.out.println(out);
    }
}
