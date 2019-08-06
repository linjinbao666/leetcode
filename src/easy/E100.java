package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 相同的树
 */
public class E100 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null&&q!=null || p!=null&&q==null) return false;
        if(!isSameTree(p.left,q.left)) return false;
        if(!isSameTree(p.right,q.right)) return false;
        if (p.val==q.val)return true;
        return false;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = new TreeNode(2);

        TreeNode treeNode2 = new TreeNode(1);
        treeNode2.left = new TreeNode(2);

        boolean out = isSameTree(treeNode1,treeNode2);
        System.out.println(out);

    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}