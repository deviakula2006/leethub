class Solution {
    public void rotate(int[][] matrix) {
        int l= matrix.length;
        
        int arr[][]= new int[l][l];
            for(int j=0;j<l;j++){
                
                 for(int i=0;i<l;i++){
               
               arr[i][j]=matrix[l-j-1][i];
             
             
            }
           
        }
       for(int j=0;j<l;j++){
                
                 for(int i=0;i<l;i++){
               
               matrix[j][i]=arr[j][i];
             
             
            }
           
        }

    }
}