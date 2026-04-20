class Solution {
    public int maxDistance(int[] nums) {
        int i=0;
        int n = nums.length;
        int j =n-1;
        int max=0;
        while(i<=j){
            if(i==j){
                i++;
                j=n-1;
            }
             if(nums[i]!=nums[j]){
                max=Math.max(max, j-i);
                
             }
             j--;

        }
        return max;
    }
}