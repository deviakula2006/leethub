class Solution {
    public boolean anagram(String one, String two){
        char[] arr = one.toCharArray();
        char[] arr2 = two.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        return Arrays.equals(arr,arr2);
    }
    public List<String> removeAnagrams(String[] word) {
        ArrayList<String> str = new ArrayList<>();
        
        String s = word[0];
        for(int i=1;i<word.length;i++){
            if(!anagram(s,word[i])) {
                str.add(s);
                s= word[i];
            }
                 
        }
        str.add(s);
        return str;
    }
}