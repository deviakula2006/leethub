class Solution {
    public void fill(int r,int c ,int cnt,char[][]arr){

        int m = arr.length;
        int n = arr[0].length;
       
         if(c<m)   arr[c][n-r-1]='*';
        
        //System.out.println(r+ " "+c);
            
            for(int j=c-cnt;j<c;j++){
                
              if(j<m)  arr[j][n-r-1]='#';
            }
        
    }
    public char[][] rotateTheBox(char[][] box) {
        int m =box.length;
        int n = box[0].length;
        char [][] rbox=new char[n][m];
        
        for(int i=0;i<n;i++){
           
          Arrays.fill(rbox[i],'.');
        

        }
         
        for(int i=0;i<m;i++){
          
            int cnt=0;
            for(int j=0;j<n;j++){
                if(box[i][j]=='#'){
                    cnt++;
                }
                else if(box[i][j]=='*'){
                  fill(i,j,cnt,rbox);
                  cnt=0;
                }

            }
            if(cnt!=0){
                
                fill(i,n,cnt,rbox);
            }
            
        }
        return rbox;
    }
}