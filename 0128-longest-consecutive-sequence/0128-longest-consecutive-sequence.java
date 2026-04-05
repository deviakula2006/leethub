class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0) return 0;
        Arrays.sort(arr);
        int cnt=0;
        int max=0;
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            System.out.println(arr[i]+" "+ cnt);
         if(arr[i+1]-arr[i]<=1){
           if(arr[i+1]-arr[i]==1) cnt++;
            
         }
         else{
            max=Math.max(cnt+1,max);
            cnt=0;
         }
        }
        max=Math.max(cnt+1,max);
        return max;
    }
}