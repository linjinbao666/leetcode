package easy;

import java.util.*;

/**
 * 二叉树的层次遍历
 */
public class E107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();
        if (root!=null)queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> tmp = new ArrayList<>();
            int level = queue.size();
            for (int i=0; i<level; i++){
                if (queue.peek().left!=null) queue.offer(queue.peek().left);
                if (queue.peek().right!=null) queue.offer(queue.peek().right);

                tmp.add(queue.poll().val);
            }
            stack.push(tmp);
        }
        while (!stack.isEmpty()){
            lists.add(stack.pop());
        }
        return lists;
    }
}
