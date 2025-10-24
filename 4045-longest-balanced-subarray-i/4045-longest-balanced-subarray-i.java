class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int len=0;
        for(int i=0;i<n;i++){
            int even=0;
            int odd=0;
             HashMap<Integer,Integer> map = new HashMap<>();
            for(int j=i;j<n;j++){
                if(nums[j]%2==0 && (!map.containsKey(nums[j]))) even++;
             else if(nums[j]%2!=0 && (!map.containsKey(nums[j]))) odd++;
             if(odd==even) len = Math.max(len,j-i+1);
               map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            }
        }
        return len;
    }
}