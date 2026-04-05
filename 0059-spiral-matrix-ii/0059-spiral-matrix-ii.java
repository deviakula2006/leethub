class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        int m = n;
       
          int t = (int)Math.ceil(Math.min(m, n) / 2.0);
       
int cnt=0;
        for(int i = 0; i < t; i++){

            
            for(int j = i; j < n - i; j++){
                cnt++;
               matrix[i][j]=cnt;

            }

           
            for(int k = i + 1; k < m - i; k++){
                cnt++;
                matrix[k][n - i - 1]=cnt;
            }

          
            if(i < m - i - 1){
                for(int l = n - i - 2; l >= i; l--){
                    cnt++;
                    matrix[m - i - 1][l]=cnt;
                }
            }

            
            if(i < n- i - 1){
                for(int o = m - i - 2; o > i; o--){
                    cnt++;
                    matrix[o][i]=cnt;
                }
            }
        }
return matrix;
    }
}