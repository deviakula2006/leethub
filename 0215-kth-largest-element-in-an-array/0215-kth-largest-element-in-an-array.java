class Solution {
    public int findKthLargest(int[] nums, int k) {
        TreeMap <Integer,Integer> map = new TreeMap<>();
         for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
         }
         int i=0;
         
         for(int n:map.keySet()){
            
            i+=map.get(n);
            if(i>=nums.length-k+1) return n;
         }
         return 0;
    }
}