package nowcoder;

import related.TreeNode;

public class HasSubtree {

    public static boolean hasSubtree(TreeNode root1, TreeNode root2) {
        if (root1==null || root2==null) return false;
        return helper(root1,root2) || hasSubtree(root1.left, root2) || hasSubtree(root1.right,root2);
    }

    public static boolean helper(TreeNode root1, TreeNode root2){
        if (root2==null) return true;
        if (root1==null) return false;
        if (root1.val==root2.val)return helper(root1.left,root2.left)&&helper(root1.right,root2.right);
        return false;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(7);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(5);

        boolean out = hasSubtree(root1,root2);

        System.out.println(out);


    }
}
