class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int cnt=0;
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            int sum =0;
            for(int j=0;j<n;j++){
                  sum+=grid[i][j];
                  arr[i][j]=sum;
                  
            }
            
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int sum=0;
                if(i>0){
                    sum+=arr[i-1][j];

                }
                sum+=arr[i][j];
                arr[i][j]=sum;
                if(sum<=k){
                       cnt++;
                      
                } 
            }
        }
        return cnt;
    }
}