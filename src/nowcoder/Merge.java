package nowcoder;

/**
 * 合并两个排序的链表
 */
public class Merge {
    public static ListNode merge(ListNode list1,ListNode list2) {
        ListNode head = new ListNode(-1);
        head.next = null;
        ListNode root = head;
        while (list1!=null && list2!=null){
            if (list1.val < list2.val){
                head.next = list1;
                head = list1;
                list1 = list1.next;
            }else {
                head.next = list2;
                head = list2;
                list2 = list2.next;
            }
        }
        if (list1==null)head.next = list1;
        if (list2==null)head.next = list2;
        return root.next;
    }

    public static ListNode merge1(ListNode list1, ListNode list2){
        ListNode head = new ListNode(-1);
        head.next = null;
        ListNode root = head;
        while (list1!=null || list2!=null){
            if (list1==null){
                head.next=list2;
                break;
            }
            if (list2==null){
                head.next=list1;
                break;
            }
            if (list1.val<list2.val){
                head.next = list1;
                head = list1;
                list1 = list1.next;
            }else {
                head.next = list2;
                head = list2;
                list2 = list2.next;
            }
        }
        return root.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        ListNode out = merge1(list1,list2);
        while (out!=null){
            System.out.println(out.val);
            out = out.next;
        }

    }
}
