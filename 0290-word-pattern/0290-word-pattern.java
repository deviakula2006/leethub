import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
      
       LinkedHashMap<Character, Integer> patmap = new LinkedHashMap<>();
       LinkedHashMap<String, Integer> smap = new LinkedHashMap<>();
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            smap.put(arr[i], i);
        }
        for (int i = 0; i < pattern.length(); i++) {
            patmap.put(pattern.charAt(i), i);
        }

        if (patmap.size() != smap.size()) return false;

        List<String> keys = new ArrayList<>(smap.keySet());
        List<Character> pkeys = new ArrayList<>(patmap.keySet());

        for (int i = 0; i < keys.size() && i < pkeys.size(); i++) {
            String key = keys.get(i);
            Character pkey = pkeys.get(i);
            System.out.println(key + " " + pkey);

            
             if (!(smap.get(key).equals(patmap.get(pkey)))) {
                return false;
             }
        }

        return true;
    }
}
   
