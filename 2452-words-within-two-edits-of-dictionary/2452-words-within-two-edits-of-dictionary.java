class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        int m = queries.length;
        int n = dictionary.length;
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            String s = queries[i];
            for(int j=0;j<n;j++){
                String p =dictionary[j];
                int cnt=0;
                for(int k=0;k<p.length();k++){
                    if(s.charAt(k)!=p.charAt(k)){
                        cnt++;
                    }

                }
                if(cnt<=2){
                    list.add(queries[i]);
                    break;
                }
            }
        }
        return list;
    }
}