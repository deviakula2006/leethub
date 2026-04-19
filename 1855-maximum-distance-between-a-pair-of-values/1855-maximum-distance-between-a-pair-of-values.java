class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {

       int m = nums1.length;
       int n =nums2.length;
       int i=m-1 , j=n-1;
       int max=0;
       while(i>=0 && j>=0){
         int num2=nums2[j];
         while(i>=0 && nums2[j]>=nums1[i]){
            if(j>=i) {max = Math.max(max,j-i);
            }
            i--;
         }
         j--;
         
       }
return max;
    }
}