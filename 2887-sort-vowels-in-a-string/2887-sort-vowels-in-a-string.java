class Solution {
    public String sortVowels(String s) {
        char arr[] = s.toCharArray();
        ArrayList<Character> str = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a' || arr[i]=='e'|| arr[i]=='i' || arr[i]=='o'|| arr[i]=='u'||arr[i]=='A' || arr[i]=='E'|| arr[i]=='I' || arr[i]=='O'|| arr[i]=='U'){
                str.add(arr[i]);
            }
        }
        Collections.sort(str);
        
       for(int i=0;i<arr.length;i++){
        if(arr[i]=='a' || arr[i]=='e'|| arr[i]=='i' || arr[i]=='o'|| arr[i]=='u'||arr[i]=='A' || arr[i]=='E'|| arr[i]=='I' || arr[i]=='O'|| arr[i]=='U'){
            arr[i]=str.get(0);
              str.remove(str.get(0));
        }
       }
      
       
       
        return new String(arr);
    }
}