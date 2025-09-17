class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     
       int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i <= k && i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) > 1) return true;
        }
       for(int j=k+1;j<n;j++){
          map.put(nums[j-k-1], map.get(nums[j-k-1])-1);
          map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
          if(map.get(nums[j]) > 1) return true;
       }
return false;

    }
}