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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        if(head==null) return head;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(temp!=null){
             map.put(temp.val,map.getOrDefault(temp.val,0)+1);
             temp=temp.next;
        }
        temp=head;

        while(temp!=null && temp.next!=null){
       
      
       
        if(map.get(temp.next.val)>1){ 
        
      temp.next=temp.next.next;
                 
        }

          else temp=temp.next;
        }
        if(map.get(head.val)>1){ 
            
           head=head.next;
          
       } 
        return head;
    }
}