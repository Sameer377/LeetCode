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

        var dummy = new ListNode(-1);
        var curr = dummy;

        var l1=list1;
        var l2=list2;

        while(l1!=null && l2!=null){

            if(l1.val<=l2.val){
                curr.next=l1;
                l1=l1.next;
            }else{
                curr.next=l2;
                l2=l2.next;
            }

            curr=curr.next;
        }

        if(l1==null){
            curr.next=l2;
        }else if(l2==null){
            curr.next=l1;
        }


        return dummy.next;
    }
}