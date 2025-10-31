class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int fqr[]=new int[101];
        Arrays.fill(fqr,0);
        for(int j=0;j<nums.length;j++){
            fqr[nums[j]]++;
        }
        int cnt =0;
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(fqr[nums[i]]==2 && cnt<2){
                arr[cnt]=nums[i];
                fqr[nums[i]]=0;
                cnt++;
            }
        }
        return arr;
    }
}