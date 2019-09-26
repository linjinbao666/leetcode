package nowcoder;

import related.TreeNode;
import sun.reflect.generics.tree.Tree;

/**
 * 二叉树的镜像
 */
public class Mirror {
    public static void mirror(TreeNode root) {
        if (root==null)return;
        if (root.left==null && root.right==null) return;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        mirror(root.left);
        mirror(root.right);

    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(10);

        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);

        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);

//        TreeNode root = new TreeNode(8);
//        root.left = new TreeNode(7);
//        root.left.left = new TreeNode(6);
//        root.left.left.left = new TreeNode(5);
//        root.left.left.left.left = new TreeNode(4);


        mirror(root);

        while (root!=null){
            System.out.println(root.val);
            root = root.left;
        }



    }
}
