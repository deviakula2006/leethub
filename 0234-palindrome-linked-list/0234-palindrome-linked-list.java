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
     private ListNode cloneList(ListNode head) {
        if (head == null) return null;
        return new ListNode(head.val, cloneList(head.next));
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode newnode=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newnode;
    }
    public boolean isPalindrome(ListNode head) {
       ListNode reversed = reverse(cloneList(head));

while (head != null && reversed != null) {
    if (head.val != reversed.val) return false;
    head = head.next;
    reversed = reversed.next;
}
return true;
    }
}