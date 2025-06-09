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
    public ListNode deleteDuplicates(ListNode head) {
        
        var ptr = head;

        while(ptr!=null){
            var t = ptr;
            while(ptr.next!=null && t.val==ptr.next.val){
                ptr=ptr.next;
            }

            t.next=ptr.next;
            ptr=ptr.next;
        }
        return head;
    }
}