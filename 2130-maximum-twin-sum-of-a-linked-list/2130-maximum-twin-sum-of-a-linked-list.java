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
    public int pairSum(ListNode head) {
    //     int sum =0;
    //     int size=0;
    //     int cnt=0;
    //     ListNode prev = head;
    //     while(temp!=null){
    //         temp=temp.next;
    //         size++;
    //     }
    //     temp=head;
    //     if(size==2){
    //         sum = head.val +head.next.val;
    //     }
    //     while(temp.next.next!=null){
    //         cnt++;
    //         if(cnt == (size/2)-1){
    //              // System.out.println(temp.next.val + " "+ temp.next.next.val);
    //         sum= Math.max(sum,(temp.next.val +temp.next.next.val));
    //      temp.next=temp.next.next.next;
    //      cnt=0;
    //      size=size-2;
    //      temp=head;
    //     // System.out.println(sum);
    //         }
    //      else {
    //         temp=temp.next;
    //      }
    //     }
    //      //System.out.println(temp.val + " "+ temp.next.val);
    //    sum = Math.max(sum,(temp.val+temp.next.val));
    //     return sum;
        ListNode temp = head;
    ArrayList<Integer> arr = new ArrayList<>();
    while(temp!=null){
        arr.add(temp.val);
        temp=temp.next;
    }
    int n = arr.size();
    int max =0;
   for(int i=0;i<n/2;i++){
    max= Math.max(arr.get(i)+arr.get(n-i-1), max);
   }
   return max;
    }
}