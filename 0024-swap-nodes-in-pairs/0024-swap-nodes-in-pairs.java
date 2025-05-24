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
    public ListNode swapPairs(ListNode head) {
          ListNode prev = null, curr = head, next = null;

        int k=2;
        int c = k;

        while (c > 0 && curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            c--;
        }

        if (c > 0 && curr==null) {
            curr = prev;
            prev = null;
            next = null;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                
            }
        }

        if (c>0) {
            return prev;
        } else {
            head.next = swapPairs(curr);
        }

        return prev;

    }
}