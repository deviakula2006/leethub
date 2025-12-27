class Solution {
    public List<List<Integer>> findsets(int[] nums ,int ind , List<Integer> list,List<List<Integer>>list2) {
        if(ind==nums.length){
            list2.add(new ArrayList<>(list));
             return list2;
        }
        findsets(nums,ind+1,list,list2);
        list.add(nums[ind]);
        findsets(nums,ind+1,list,list2);
        list.remove(list.size()-1);
        return list2;
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<List<Integer>> list2=new ArrayList<>();
        findsets(nums,0,list,list2);
        return list2;
    }
}