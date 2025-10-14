class Solution {
    public boolean ispossible(List<Integer> nums, int k,int i){
        int cnt =0;
         
        for(int j=i+1;j<i+(2*k) ;j++){
           
         if(nums.get(j) <= nums.get(j-1) && j!=i+k) return false;
            else if(nums.get(j) <= nums.get(j-1))  cnt++;
        }
        if(cnt<=1) return true;
        return false;
    }
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        if(k==1) return true;
        for(int i=0;i<=n-2*k;i++){
            if(ispossible(nums,k,i)) return true;
            
        }
        return false;
    }
}