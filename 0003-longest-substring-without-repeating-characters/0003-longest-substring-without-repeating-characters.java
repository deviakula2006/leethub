class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        
        int fqr[]=new int[96];
        int l =0;
        int r=0;
        int max=0;
        for(int i=0;i<n;i++){
              fqr[s.charAt(i)-' ']++;
              if(fqr[s.charAt(i)-' ']>1){
                max =Math.max(max,r-l);
             for(int j=l;j<r;j++){
                fqr[s.charAt(j)-' ']--;
                if( fqr[s.charAt(i)-' ']==1){
                    l=j+1;
                     System.out.println(i);
                    break;

                   
                }
             }
              }
              r++;








              
        }
        max=Math.max(r-l, max);
        return max;

    }
}