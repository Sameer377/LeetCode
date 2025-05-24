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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null || head.next==null) return head;

        int len=1;

        ListNode ptr = head;
        while(ptr.next!=null){
            ptr=ptr.next;
            len++;
        }

        k=k%len;


        ListNode curr=head;
        int c=1;
        while(c<len-k){
            curr=curr.next;
            c++;
        }

        ptr.next=head;
        head=curr.next;
        curr.next=null;

        return head;
    }
}