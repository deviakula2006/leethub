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
        ListNode temp=head;
        if(head ==null) return head;
        int l=0;
        while(temp!=null){
            if(temp.next==null){
                temp.next=head;
                l++;
                break;
            }
            l++;
            temp=temp.next;
            
        }
       
        k=k%l;
        int cnt=0;
        temp=head;

        while(temp!=null){
           
           cnt++;
           if(cnt==Math.abs(l-k)){
            head=temp.next;
            temp.next=null;
            break;
           } 
           temp=temp.next;
        }
        return head;
    }
}