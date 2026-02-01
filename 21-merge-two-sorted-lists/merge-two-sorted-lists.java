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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Dummy node to simplify head handling
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        ListNode p1 = list1;
        ListNode p2 = list2;

        // While both lists have nodes
        while (p1 != null && p2 != null) {

            if (p1.val <= p2.val) {
                tail.next = p1;   // attach p1
                p1 = p1.next;     // move p1
            } else {
                tail.next = p2;   // attach p2
                p2 = p2.next;     // move p2
            }

            tail = tail.next;     // move tail
        }

        // Attach remaining nodes
        if (p1 != null) tail.next = p1;
        if (p2 != null) tail.next = p2;

        return dummy.next; // real head
    }
}
