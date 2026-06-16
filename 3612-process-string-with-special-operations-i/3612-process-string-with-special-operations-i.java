class Solution {
    public String processStr(String s) {
        StringBuilder str = new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)>='a'&& s.charAt(i)<='z') str.append(s.charAt(i));
            if(s.charAt(i)=='#') str.append(str);
            if(s.charAt(i)=='*' && str.length()>0) str.deleteCharAt(str.length()-1);
            if(s.charAt(i)=='%') str.reverse();
        }
        s=str.toString();
        return s;
    }
}