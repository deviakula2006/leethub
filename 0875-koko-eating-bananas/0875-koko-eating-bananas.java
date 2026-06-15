class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       Arrays.sort(piles);
       int n = piles.length;
       int left =1;
       int right=piles[n-1]; 
      int ans = piles[n-1]+1;
      if(n==h) return piles[n-1];
        while(left<=right){
             long sum =0;
        int mid = (left+right)/2;
        for(int i=0;i<n;i++){
             sum = sum+ (int)Math.ceil(piles[i]/ (mid*1.0));
        }
       if(sum<=h){
        ans = Math.min(mid,ans);
        right=mid-1;
       }
      
       else if(sum>h){
        left =mid+1;
       }
        }
    
        return ans;
    }
}