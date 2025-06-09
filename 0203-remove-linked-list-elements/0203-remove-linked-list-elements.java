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
    public ListNode removeElements(ListNode head, int val) {
        
        var ptr = head;

        if(ptr==null) return head;

        while(ptr!=null && ptr.val==val){
            ptr=ptr.next;
        }       
        head=ptr;

        while(ptr!=null && ptr.next!=null){

            if(ptr.next.val==val){
                ptr.next = ptr.next.next;
            }

            if(ptr.next!=null && ptr.next.val!=val)
            ptr=ptr.next;
        }

        return head;
    }
}