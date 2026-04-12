class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0;
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int l = i+1;
            int r = n-1;
              while(l<r){
                int x=nums[i]+nums[l]+nums[r];
             if(x<=target){
                if(target-x <min){
               min = target-x;
               sum=x;
               
                }
                 l++;
                 r=n-1;}
                else if(x>target){
                  if(x-target<min){
                    min = x-target;
                    sum=x;
                    
                  }
                  r--;
                }
                else{
                    r--;
                }
                    
             }
              
        }
        return sum;
    }
}