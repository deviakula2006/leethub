class Solution {
    public int minOperations(int[] nums, int k) {
        int sum =0;
        int ans =0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%k==0) return 0;
        else {
           double ki=(double)(k*1.0);
            int floor = (int)Math.floor(sum%(ki));
            int ceil= (int)Math.ceil(sum%(ki));
             ans = Math.min(floor,ceil);
        }
        return ans;
    }
}