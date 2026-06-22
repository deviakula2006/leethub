class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map=new HashMap<>();
        int min=text.length();
        for(int i=0;i<text.length();i++){
            map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
        }
           if (map.getOrDefault('b', 0) == 0 || 
            map.getOrDefault('a', 0) == 0 || 
            map.getOrDefault('l', 0) / 2 == 0 || 
            map.getOrDefault('o', 0) / 2 == 0 || 
            map.getOrDefault('n', 0) == 0) {
            return 0;
        }
           for(int i=0;i<text.length();i++){
          
           if(text.charAt(i)=='b'|| text.charAt(i)=='a'|| text.charAt(i)=='l'|| text.charAt(i)=='o'|| text.charAt(i)=='n') {
           if(text.charAt(i)=='l' ||text.charAt(i)=='o' ) min = Math.min(min,(map.get(text.charAt(i))/2));
           else min = Math.min(min,map.get(text.charAt(i)));
           //System.out.println()
           }

        }
        return min;
    }
}