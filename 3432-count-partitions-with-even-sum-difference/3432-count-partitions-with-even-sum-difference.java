class Solution {
    public int countPartitions(int[] nums) {
        int n  = nums.length;
        int sum =0;
        int cnt=0;
        int sum2 =0;
       for(int i=0;i<n;i++){
        sum+= nums[i];
       }
       for(int i=0;i<n-1;i++){
        sum2+=nums[i];
        if(Math.abs(sum-2*sum2) %2 ==0){
            cnt++;
        }
        
       }
       return cnt;
    }
}