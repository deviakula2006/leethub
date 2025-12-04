class Solution {
    public int countCollisions(String dir) {
        Stack <Character> stack = new Stack<>();
        int sum=0;
        int sc=0;
        for(int i=0;i<dir.length();i++){
               if(dir.charAt(i)=='R'){
                stack.push(dir.charAt(i));
                sc=0;
               }
              else if(dir.charAt(i)=='S'){
                if(!stack.isEmpty()){
                    sum+=stack.size();
                    
                }
                sc=1;
                stack.clear();
               
               }
                 else {
                    
                    if(!stack.isEmpty()){
                        if(stack.peek()=='R'){
                         sum+=stack.size()+1;
                        sc=1;
                        stack.clear();
                        }
                        else if(sc==1) {
                          sum++;
                        }
                    }
                   else  if(sc!=0){
                        sum++;
                    }
                 }
        }
        return sum;

    }
}