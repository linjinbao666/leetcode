package easy;

/**
 * 二叉树的最小深度
 */
public class E111 {
    private int dep=0;
    public int minDepth(TreeNode root) {
        if (root==null) return 0;
        if (root.left==null){
            if (root.right==null) return dep+1;
            return minDepth(root.right)+dep+1;
        }
        if (root.right==null){
            if (root.left==null) return dep+1;
            return minDepth(root.left)+dep+1;
        }
        return Math.min(minDepth(root.left),minDepth(root.right))+dep+1;
    }
}
