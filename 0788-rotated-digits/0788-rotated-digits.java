class Solution {
    public int check(int num){
      
       StringBuilder  str = new StringBuilder (Integer.toString(num));
       for(int i=0;i<str.length();i++){
        char r = str.charAt(i);
        if(r=='3' || r=='4' || r=='7') return -1;
         switch (r){
                 case '2': str.setCharAt(i,'5'); break;
                 case '5': str.setCharAt(i,'2');break;
                 case '6':str.setCharAt(i,'9'); break;
                 case '9':str.setCharAt(i,'6'); break;
       }
           
     
        
        
    }
    String st = str.toString();
       int rev = Integer.parseInt(st);
    return rev;
    }
    public int rotatedDigits(int n) {
        int cnt=0;
        for(int i=1;i<=n;i++){
            int flag=check(i);
            
            if(flag!=i&& flag!=-1){
              
                     cnt++;
            } 
        }
        return cnt;
    }
}