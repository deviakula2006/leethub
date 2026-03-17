class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        List<Map.Entry <String,Integer>> en =new ArrayList<>( map.entrySet());
        Collections.sort(en,(a,b)->{
            if(!(a.getValue()==b.getValue())){
                return b.getValue()-a.getValue();
            }
            else {
                return a.getKey().compareTo(b.getKey());
            }
        });
        List<String> keys=new ArrayList<>();
        int i=0;
        for(Map.Entry<String,Integer> list:en){
           if(i<k) keys.add(list.getKey());
           i++;
        }
        return keys;
    }
}