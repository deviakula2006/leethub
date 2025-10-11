class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n =energy.length;
        int max=-10000;
        for(int i=0;i<n;i++){
            if(i>k-1){
                int prev= energy[i]+energy[i-k];
                if(prev>energy[i]){
                    energy[i]=prev;
                }
            }
        }
        // if(n-k<k){
        // for(int i=n-1;i>=k;i--){
        //     max=Math.max(energy[i],max);
        // }
        // }
        
            int cnt =0;
            int i=n-1;
            while(cnt<k){
             max=Math.max(energy[i],max);
             i--;
             cnt++;
            }
        
        return max;
    }
}