class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int n = nums.length;
       int cnt=0;
       int pre=0;
       for(int i=0;i<n;i++){
        pre+=nums[i];
        //System.out.println(pre);
         if(map.get(pre-k)!=null) {
            cnt+= map.get(pre-k);
            

        }
        map.put(pre,map.getOrDefault(pre,0)+1);
        if(pre==k) cnt++;
       
       }
       return cnt;
    }
}