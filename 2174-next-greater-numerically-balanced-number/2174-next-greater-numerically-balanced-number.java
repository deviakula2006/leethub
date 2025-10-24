class Solution {
    public int nextBeautifulNumber(int n) {
        int i = n+1;
        
        while(i<=Integer.MAX_VALUE){
        HashMap<Integer,Integer> map = new HashMap<>();
        int num = i;
        int cnt =0;
        while(num>0){
            int r=num%10;
            map.put(r,map.getOrDefault(r,0)+1);
            num=num/10;
        }
              int flag =1;
        for (int key : map.keySet()) {
    if (map.get(key) != key) {
        flag=0;
    }
}
        if(flag==1){
            return i;   
        }
        i++;
        }
               return 0;
     }
}