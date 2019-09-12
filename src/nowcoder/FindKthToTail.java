package nowcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 链表中倒数第K个节点1,{1,2,3,4,5}
 */
public class FindKthToTail {
    public static ListNode findKthToTail(ListNode head,int k) {
        Stack<ListNode> stack = new Stack();
        int count = 0;
        while (head!=null){
            stack.push(head);
            head = head.next;
            count++;
        }
        if (count<k) return null;
        ListNode outNode =null;
        while (k-->0) outNode=stack.pop();
        return outNode;
    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        int k = 1;
        ListNode out = findKthToTail(listNode,1);
        System.out.println(out.val);

    }
}
