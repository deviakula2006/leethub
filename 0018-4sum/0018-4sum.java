class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       

        Arrays.sort(nums);
 Set <List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
            int l = j+1;
            int r = nums.length-1;
            while(l<r){
                long x =(long)nums[l]+nums[r]+nums[i]+nums[j];
                if(x==target){
               set.add(Arrays.asList(nums[i],nums[l],nums[r],nums[j]));
               l++;
              r--;
                }
                else if(x<target){
                    l++;
                }
                else {
                    r--;
                }

                }
            }
        }
             List<List<Integer>> list = new ArrayList<>(set);
        return list;
        }
       
    }

    