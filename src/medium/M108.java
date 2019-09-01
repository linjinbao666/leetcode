package medium;

/**
 * 将有序数组转换为二叉搜索树
 */
public class M108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums,0,nums.length);
    }

    public TreeNode sortedArrayToBST(int[] nums, int start, int end){
        if (start == end) return null;
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums,start,mid);
        root.right = sortedArrayToBST(nums,mid+1,end);
        return root;
    }

    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};

    }
}
