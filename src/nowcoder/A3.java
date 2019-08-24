package nowcoder;


import java.util.ArrayList;
import java.util.Stack;

/**
 * 从尾到头打印链表
 */
public class A3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while(listNode!=null){
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList list = new ArrayList();
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }

}
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
    }
}
