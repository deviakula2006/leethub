class Solution {
    public int countOdds(int low, int high) {
        int cnt=0;
        if(low%2!=0) cnt++;
        if(low!=high && high%2!=0) cnt++;
        int ans = (high-low)/2;
        if(cnt==2) ans --;
        cnt+=ans;
        return cnt;
    }
}