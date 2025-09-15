/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        int cnt =0;
        ListNode temp=head;
        HashMap <ListNode,Integer> map = new HashMap<>();
        while(temp!=null){
           map.put(temp,cnt);
           if( map.get(temp.next)!=null && map.get(temp.next)<=map.get(temp)) return true;
            temp=temp.next;
             cnt++;
        }
       
        return false;
    }
}