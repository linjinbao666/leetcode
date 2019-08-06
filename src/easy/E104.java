package easy;

/**
 * 二叉树的最大深度
 */
public class E104 {
    public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        if (root.left==null && root.right==null) return 1;
        if (root.left==null){
            return maxDepth(root.right)+1;
        }
        if (root.right==null){
            return maxDepth(root.left)+1;
        }
        int max1 = maxDepth(root.left)+1;
        int max2 = maxDepth(root.right)+1;

       return max1>max2?max1:max2;

    }

    public static void main(String[] args) {

    }
}
