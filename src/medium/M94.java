package medium;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的中序遍历
 */
public class M94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List list = new ArrayList();
        helper(root,list);
        return list;
    }

    public void helper(TreeNode root, List list){
        if (root!=null){
            if (root.left!=null)helper(root.left, list);
            list.add(root.val);
            if (root.right!=null) helper(root.right,list);
        }
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){val = x;}
}
