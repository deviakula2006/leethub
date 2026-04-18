class Solution {
     public int Reversed(int num){
        int ans =0;
        while(num>0){
            int r = num%10;
            ans= ans*10+r;
            num=num/10;
        }
        return ans;
    }
    public int mirrorDistance(int n) {
        int rev=Reversed(n);
        return Math.abs(n-rev);
    }
}