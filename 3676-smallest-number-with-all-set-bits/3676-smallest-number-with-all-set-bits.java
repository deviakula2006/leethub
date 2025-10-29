class Solution {
    public int smallestNumber(int n) {
        double num = Math.log(n)/Math.log(2);
        int sqr1 = (int)Math.ceil(num/1.0);
        
           int ans =(int)Math.pow(2,sqr1)-1;
           if(n==Math.pow(2,sqr1)) ans =(int)Math.pow(2,sqr1+1)-1;
        return ans;

    }
}