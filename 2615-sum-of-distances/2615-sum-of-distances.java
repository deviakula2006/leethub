class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Long> map=new HashMap<>();
       HashMap<Integer,Long> map2=new HashMap<>();
        HashMap<Integer,Long> set=new HashMap<>();
       HashMap<Integer,Long> set2=new HashMap<>();
        for(int i=0;i<n;i++){
            
            map.put(nums[i],map.getOrDefault(nums[i],0L)+i);
             map2.put(nums[i],map2.getOrDefault(nums[i],0L)+1);
        }
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
             set.put(nums[i],set.getOrDefault(nums[i],0L)+i);
             set2.put(nums[i],set2.getOrDefault(nums[i],0L)+1);
           long sum = map.get(nums[i])-set.get(nums[i])-i;
           long cnt = map2.get(nums[i])-set2.get(nums[i])-1;
            long sum2 = set.get(nums[i]);
            long cnt2=set2.get(nums[i]);
             
             arr[i] = (i * cnt2 - sum2) + (sum - i * cnt);
        }  
        return arr;
    }
}