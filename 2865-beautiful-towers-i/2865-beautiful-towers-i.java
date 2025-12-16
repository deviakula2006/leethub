class Solution {
    public long maximumSumOfHeights(int[] heights) {
        int n= heights.length;
        long max=0;
        for(int i=0;i<n;i++){
            int l=i;
            int r = i;
            long left=0;
            long right=0;
            int arr[]=Arrays.copyOf(heights,n);
            while(l>=0 || r<n){
                if(l>0){
                    if(arr[l-1]>arr[l]) {
                        
                        arr[l-1]=arr[l];
                    }
                    left+=arr[l-1];
                    
                }
                if(r<n-1){
                    if(arr[r+1]>arr[r]) {
                        
                        arr[r+1]=arr[r];
                    }
                    right+=arr[r+1];
                }
                l--;
                r++;

            }
            max=Math.max(max,(left+right)+arr[i]);
        }
        return max;
    }
}