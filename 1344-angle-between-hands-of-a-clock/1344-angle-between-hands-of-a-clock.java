class Solution {
    public double angleClock(int hour, int min) {
        double adj = 0;
        double ans=0;
        if(hour>6) adj=hour-6;
        else if(hour==6) adj=12;
        else adj=hour+6;
        double hr=(double) min/2.0;
        double adjt=180-hr;
        double mini= (double) min/5;
        if(mini>=adj) ans= Math.abs(adjt+ (mini-adj)*30);
        else ans=Math.abs(adjt-(adj-mini)*30);
       // System.out.println(mini );
         ans =Math.min(ans, Math.abs((double)360-ans));
        return ans;
    }
}