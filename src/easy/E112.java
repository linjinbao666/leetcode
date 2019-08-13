package easy;

/**
 * 路径总和
 */
public class E112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null) return false;
        if (root.left==null) {
            if (root.right==null) return sum==root.val?true:false;
            return hasPathSum(root.right,sum-root.val);
        }
        if (root.right==null) {
            if (root.left==null) return sum==root.val?true:false;
            return hasPathSum(root.left,sum-root.val);
        }
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}
