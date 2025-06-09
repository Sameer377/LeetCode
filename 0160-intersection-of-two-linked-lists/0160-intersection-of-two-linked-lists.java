/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    HashSet<ListNode> set = new HashSet<>();
    
    while(headA!=null){
        set.add(headA);
        headA=headA.next;
    }        

    while(headB!=null && !set.contains(headB)){
        headB=headB.next;
    }

    if(set.contains(headB)){
        return headB;
    }

    return null;
}
}