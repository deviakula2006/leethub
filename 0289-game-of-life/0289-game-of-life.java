class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int arr[][]=new int [m][n];
        for(int i=0;i<board.length;i++){
           arr[i]=board[i].clone();
        }
        for(int i=0;i<m;i++){
           
            for(int j=0;j<n;j++){
                 int cnt =0;
                if(i-1>=0 && j-1>=0){
                    if(arr[i-1][j-1]==1) cnt++;
                }
            
               if(i-1>=0 && j>=0){
                    if(arr[i-1][j]==1) cnt++;
                }
                if(i-1>=0 && j+1<n){
                    if(arr[i-1][j+1]==1) cnt++;
                }
                if(i>=0 && j-1>=0){
                    if(arr[i][j-1]==1) cnt++;
                }
                if(i>=0 && j+1<n){
                    if(arr[i][j+1]==1) cnt++;
                }
                 if(i+1<m && j-1>=0){
                    if(arr[i+1][j-1]==1) cnt++;
                }
                 if(i+1<m && j>=0){
                    if(arr[i+1][j]==1) cnt++;
                }
                 if(i+1<m && j+1<n){
                    if(arr[i+1][j+1]==1) cnt++;
                }
               if(arr[i][j]==1 && (cnt==2 || cnt==3)) board[i][j]=1;
              else if(arr[i][j]==0 && cnt==3) board[i][j]=1;
              else board[i][j]=0;

            }
           
        }
        
        }

    }
