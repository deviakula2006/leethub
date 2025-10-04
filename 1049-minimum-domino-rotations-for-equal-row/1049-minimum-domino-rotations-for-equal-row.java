class Solution {
    public int minDominoRotations(int[] tops, int[] down) {
        int fqr[]=new int[7];
         int fqr2[]=new int[7];
         int tmax=0;
         int tmaxn=0;
        int dmax=0;
        int dmaxn=0;
        int n= tops.length;
         for(int i=0;i<tops.length;i++){
            fqr[tops[i]]++;
            if(fqr[tops[i]]>tmax){
                tmax = fqr[tops[i]];
                tmaxn=tops[i];
            }
            fqr2[down[i]]++;
            if(fqr2[down[i]]>dmax){
                dmax=fqr2[down[i]];
                dmaxn=down[i];
            }
         }
         int tflag=1;
         int dflag =1;
         int tcnt=0;
         int dcnt=0;
         for(int i=0;i<n;i++){
            if(tops[i]!=tmaxn && down[i]!=tmaxn) tflag=0;
            else if(tops[i]!=tmaxn && down[i]==tmaxn) tcnt++;
            if(down[i]!=dmaxn && tops[i]!=dmaxn) dflag=0;
            else if(down[i]!=dmaxn && tops[i]==dmaxn) dcnt++;
         }
         if(tflag==0 && dflag==0) return -1;
         if(tflag ==0) return dcnt;
         else if(dflag ==0) return tcnt;
         int ans = Math.min(tcnt,dcnt);
         return ans;
    }
}