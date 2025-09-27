class Solution {
    public int findSteps(int n,HashMap<Integer,Integer>map ){
        if(n<=3) return n;
        if(map.containsKey(n)){
             return map.get(n);
        } 
        int ans = findSteps(n-1,map);
        int ans2 =findSteps(n-2,map);
         map.put(n,ans+ans2);
         return ans+ans2;
    }
    public int climbStairs(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
       return findSteps(n,map);
       
    }
}