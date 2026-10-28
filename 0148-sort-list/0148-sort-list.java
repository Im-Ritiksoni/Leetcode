/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        return show(head);
    }
       public ListNode show(ListNode x) {
        
        if (x == null || x.next == null) {
            return x;
        }

        ListNode slow = x;
        ListNode fast = x.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode a = x;
        ListNode b = slow.next;
        slow.next = null;

        a = show(a);
        b = show(b);

        return sum(a, b);
    }

    public ListNode sum(ListNode a, ListNode b) {

        ListNode dummy = new ListNode(0);
        ListNode x = dummy;

        while (a != null && b != null) {

            if (a.val < b.val) {
                x.next = a;
                a = a.next;
            } else {
                x.next = b;
                b = b.next;
            }

            x = x.next;
        }

        if (a != null) {
            x.next = a;
        } else {
            x.next = b;
        }

        return dummy.next;

    }
    
}