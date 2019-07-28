package medium;

/**
 * 两数相加
 * 
 * @author linjinbao
 *
 */
public class M2 {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode cur = head;
		int carry = 0;
		while(l1!=null || l2!=null) {
			int x = l1!=null ? l1.val : 0;
			int y = l2!=null ? l2.val : 0;
			int sum = x+y+carry;
			cur.next = new ListNode(sum%10);
			carry = sum/10;
			cur = cur.next;
			if(l1!=null) l1 = l1.next;
			if(l2!=null) l2 = l2.next;
		}
		if(carry==1) cur.next = new ListNode(carry);
		return head.next;
	}
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		ListNode l3 = addTwoNumbers(l1, l2);
		while(l3!=null){
			System.out.println(l3.val + "\t");
			l3 = l3.next;
		}
		
	}

}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}
