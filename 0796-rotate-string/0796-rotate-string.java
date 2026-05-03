class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder str = new StringBuilder(s);
        for(int i=0;i<str.length();i++){
            char c = str.charAt(0);
            str.deleteCharAt(0);
            str.append(c);
            System.out.println(str);
            if(goal.equals(str.toString())) return true;
        }
        return false;
    }
}