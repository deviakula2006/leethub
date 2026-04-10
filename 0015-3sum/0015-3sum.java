class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
 Set <List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                if(nums[l]+nums[r]+nums[i]==0){
               set.add(Arrays.asList(nums[i],nums[l],nums[r]));
               l++;
               r=nums.length-1;
                }
                else if(nums[l]+nums[r]+nums[i]<0){
                    l++;
                }
                else {
                    r--;
                }

                }
            }
             List<List<Integer>> list = new ArrayList<>(set);
        return list;
        }
       
    }
