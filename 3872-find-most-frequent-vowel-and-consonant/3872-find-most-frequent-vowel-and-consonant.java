class Solution {
    public int maxFreqSum(String s) {
        int maxo =0;
        int maxc=0;
        int fqr[]= new int[26];
        for(int i=0;i<s.length();i++){
            fqr[s.charAt(i)-'a']++;
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u'){
                if(fqr[s.charAt(i)-'a']>=maxo) maxo=fqr[s.charAt(i)-'a'];
            }
                else {
                  if(fqr[s.charAt(i)-'a']>=maxc) maxc=fqr[s.charAt(i)-'a'];
                }
            
        }
        return maxo+maxc;
    }
}