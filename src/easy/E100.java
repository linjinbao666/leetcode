package easy;



/**
 * 相同的树
 */
public class E100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null) return true;

        return false;
    }

}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}