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
    public ListNode oddEvenList(ListNode head) {
        
        var dummy = new ListNode(-1);

        var oddList = new ListNode(-1);
        var evenList = new ListNode(-1);


        var l1=oddList;
        var l2 = evenList;

        boolean odd=true;

        var ptr = head;
        while(ptr!=null){
            if(odd){
                l1.next=new ListNode(ptr.val);
                l1=l1.next;
                odd=false;
            }else{
                odd=true;
                l2.next=new ListNode(ptr.val);
                l2=l2.next;
            }

            ptr=ptr.next;
        }

        l1.next=evenList.next;
        dummy.next=oddList.next;

        return dummy.next;
    }
}