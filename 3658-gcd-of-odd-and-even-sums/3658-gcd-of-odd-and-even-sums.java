class Solution {
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int os=0;
        int es=0;
        int cnt=1;
        for(int i=0;i<n;i++){
           os+=i+cnt;
           es+=(cnt*2);
           cnt++;
        }
        int ans =gcd(os,es);
        return ans;
    }
}