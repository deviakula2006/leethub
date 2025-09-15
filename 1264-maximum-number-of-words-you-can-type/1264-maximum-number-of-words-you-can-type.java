class Solution {
    public boolean checkbroken(String s , String broken){
        for(int i=0;i<broken.length();i++){
           if(s.indexOf(broken.charAt(i))!=-1) return true;
        }
        return false;
    }
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[] = text.split(" ");
        int cnt =0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(!checkbroken(arr[i],brokenLetters)) cnt++;
        }
        return cnt;
    }
}