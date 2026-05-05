class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> list2=new ArrayList<>();
        HashSet<List<Integer>> set2=new HashSet<>();
       int n = nums.length;
      for(int i=0;i<n-1;i++){
               int j=i+1;
               int c=0;
               int r=nums[i]*-1;
               HashSet<Integer> set=new HashSet<>();
               for(int num:nums){
                c++;
                if(c-1<j) continue;
                if(set.contains(r-num)){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(num);
                    list.add(r-num);
                    Collections.sort(list);
                    set2.add(list);
                }
                  set.add(nums[c-1]);
               }
      }
       for(List <Integer> k:set2){
        list2.add(k);
       }
       return list2;
        }
       
    }
