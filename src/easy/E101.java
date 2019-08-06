package easy;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * 对称二叉树
 */
public class E101 {
    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }
    public static boolean isMirror(TreeNode p, TreeNode q){
        if(p==null && q==null) return true;
        if(p==null&&q!=null) return false;
        if(p!=null&&q==null) return false;
        if(p.val!=q.val) return false;
        return isMirror(p.left,q.right)&&isMirror(p.right,q.left);
    }



    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(4);
        treeNode.left.left = new TreeNode(3);

        treeNode.right = new TreeNode(2);
        treeNode.right.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(4);

        boolean out = isSymmetric(treeNode);
        System.out.println(out);
    }


}

