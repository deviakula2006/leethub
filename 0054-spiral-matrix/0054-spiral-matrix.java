class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
          int cnt = (int)Math.ceil(Math.min(m, n) / 2.0);
        ArrayList<Integer> dum = new ArrayList<>();

        for(int i = 0; i < cnt; i++){

            
            for(int j = i; j < n - i; j++){
                dum.add(matrix[i][j]);
            }

           
            for(int k = i + 1; k < m - i; k++){
                dum.add(matrix[k][n - i - 1]);
            }

          
            if(i < m - i - 1){
                for(int l = n - i - 2; l >= i; l--){
                    dum.add(matrix[m - i - 1][l]);
                }
            }

            
            if(i < n- i - 1){
                for(int o = m - i - 2; o > i; o--){
                    dum.add(matrix[o][i]);
                }
            }
        }

        return dum;
    }
}
