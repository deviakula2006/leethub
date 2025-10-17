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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int cnt =0;
        if(left ==right) return head;
        ListNode temp=head;
        ListNode head1=head;
        ListNode joint=head;
        int flag =0;
        while(cnt<=left &&temp!=null && temp.next!=null){
            cnt++;
             if(cnt==left-1){
                
                 joint=temp;   
            }
            else if(cnt ==left) {
                head1=temp;
               
            }       
              temp=temp.next;
        }
        ListNode prev=head1;
             cnt=0;
             ListNode temp2 = head1;
        while(cnt<right-left  &&temp2!=null && temp2.next!=null){
                prev=temp2.next;
                temp2.next = prev.next;
                prev.next=head1;
                head1=prev;
                cnt++;
        }
       
       if(left==1) head = head1;
       else if(joint!=head1) joint.next=head1;
       
        return head;
    }
}