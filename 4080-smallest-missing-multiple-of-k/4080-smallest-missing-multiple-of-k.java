class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        int cnt =0;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
           if(nums[i]%k==0 && nums[i]!=nums[i+1]){
            cnt++;
            if(cnt*k !=nums[i]) return cnt*k;
           }
        }
        if(nums[n-1]%k==0){
            cnt++;
            if(cnt*k !=nums[n-1]) return cnt*k;
        }
        cnt++;
        return cnt*k;
    }
}