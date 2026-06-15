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
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        if(head==null|| head.next==null) return null;
        while(fast != null && fast.next != null && slow!=null && slow.next!=null){
    
    ListNode node=null;
    if(fast!=null && fast.next!=null && fast.next.next!=null) node =fast.next.next;
   
    if(node ==null || node.next==null){
       if(slow.next!=null && slow.next.next!=null) slow.next=slow.next.next;
       else slow.next=null;
       break;
    }
    slow = slow.next;
    fast = fast.next.next;
}

 return head;
    }
}