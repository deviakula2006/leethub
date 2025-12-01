class Solution {
    public int countElements(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer, Integer>> list =
        new ArrayList<>(map.entrySet());

list.sort((a, b) -> b.getKey().compareTo(a.getKey()));
int freq=0;
int cnt=0;
for (Map.Entry<Integer, Integer> entry : list) {
   if(freq>=k) cnt+=entry.getValue();
   freq+=entry.getValue();
}

 return cnt;
    }
}