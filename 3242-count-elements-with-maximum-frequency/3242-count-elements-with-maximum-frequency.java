class Solution {
    public int maxFrequencyElements(int[] nums) {
        int fqr []= new int[101];
        int n = nums.length;
        int f =0;
        int cnt =0;
        for(int i=0;i<n;i++){
            fqr[nums[i]]++;
            f= Math.max(f,fqr[nums[i]]);
        }
        for(int i=0;i<n;i++){
            if(fqr[nums[i]]==f) cnt++;
        }
        return cnt;
    }
}