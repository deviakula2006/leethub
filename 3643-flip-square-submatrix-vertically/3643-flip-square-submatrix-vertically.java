class Solution {
    public int[][] reverseSubmatrix(int[][] arr, int x, int y, int k) {
        int flag =0;
       
        int m = arr.length;
        int n = arr[0].length;
       int xcnt=x+k;
       int var =0;
       int size = (int)Math.ceil(x+k/2);
       System.out.println(size);
      for(int i=x;i<=size-1  ;i++){
        var++;
        for(int j = y;j<y+k;j++){
            int temp = arr[i][j];
            arr[i][j]=arr[xcnt-var][j];
            arr[xcnt-var][j]=temp;
        }
        
      }

       
       
        return arr;
    }
}