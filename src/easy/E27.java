package easy;

/**
 * 移除元素
 * nums = [3,2,2,3], val = 3
 */
public class E27 {
    public static int removeElement(int[] nums, int val) {
        int len=nums.length;
        for (int i=0;i<len;i++){
            if (val==nums[i]){
                for (int j=i;j<len-1;j++){    //前移操作
                    nums[j]=nums[j+1];
                }
                len--;
                i--;
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int out = removeElement(nums,val);
        System.out.println(out);
    }

}
