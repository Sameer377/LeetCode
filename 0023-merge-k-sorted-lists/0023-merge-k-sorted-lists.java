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
    public ListNode mergeKLists(ListNode[] lists) {
        
        List<Integer> l = new ArrayList<>();
        for(ListNode ptr:lists){

            while(ptr!=null){
                l.add(ptr.val);
                ptr=ptr.next;
            }

        }

        Collections.sort(l);
        ListNode d = new ListNode(-1);
        ListNode node;
        node=d;

        for(int i:l){
            node.next=new ListNode(i);
            node=node.next;
        }

        return d.next;
    }
}