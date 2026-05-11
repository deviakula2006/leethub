class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
             String s = Integer.toString(nums[i]);
             for(int j=0;j<s.length();j++){
                String st= Character.toString(s.charAt(j));
                list.add(Integer.parseInt(st));
             }
            }
            int m=list.size();
            int arr[]=new int[m];
            for(int i=0;i<m;i++){
                arr[i]=list.get(i);
            }
            return arr;
    }
}