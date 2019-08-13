package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的层次遍历
 */
public class E102 {
    private List<List<Integer>> lists = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
       if (root==null) return lists;
       helper(root,0);
       return lists;
    }
    public void helper(TreeNode now, int depth){
        if (depth == lists.size()) lists.add(new ArrayList<Integer>());
        lists.get(depth).add(now.val);
        if (now.left!=null) helper(now.left,depth+1);
        if (now.right!=null) helper(now.right,depth+1);
    }




}
