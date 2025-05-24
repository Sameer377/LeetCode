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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        for(int i=1;i<left;i++){
            prev=prev.next;
        }

        ListNode cur = prev.next;
        ListNode prev1=null;

        for(int i=left;i<=right;i++){
            ListNode temp = cur.next;
            cur.next = prev1;
            prev1 = cur;
            cur=temp;
        }

        ListNode t = prev.next;
        prev.next=prev1;
        t.next=cur;

        return dummy.next;


    }
}