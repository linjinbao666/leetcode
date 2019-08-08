package easy;

/**
 * 平衡二叉树
 * [3,9,20,null,null,15,7]
 * 短路算法带来程序的提升
 */
public class E110 {
    public static boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        int leftDepth = deepth(root.left);
        int rightDepth = deepth(root.right);
        int len = leftDepth-rightDepth;
        if (len>1 || len<-1) return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    public static int deepth(TreeNode root){
        if (root==null) return 0;
        return Math.max(deepth(root.left),deepth(root.right))+1;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = null;
        treeNode.right = new TreeNode(2);

        boolean out = isBalanced(treeNode);
        System.out.println(out);

    }
}
