class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        while(n>2){
            StringBuilder str = new StringBuilder();
            for(int i=0;i<n-1;i++){
                int num = ((s.charAt(i)-'0')+(s.charAt(i+1)-'0'))%10;
                String st = Integer.toString(num);
                str.append(st);

            }
            s= str.toString();
            n=s.length();
        }
        return s.charAt(0)==s.charAt(1);
    }
}