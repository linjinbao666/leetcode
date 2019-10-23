package easy;


/**
 * 删除排序数组中的重复项 [1,1,2]
 */
public class E26 {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int i=0;
        for (int j=1; j<len; j++){
            if (nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
