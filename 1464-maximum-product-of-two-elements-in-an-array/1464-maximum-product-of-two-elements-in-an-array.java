class Solution {
    public int maxProduct(int[] nums) {
        int fb=0;
        int sb =0;
        int i=0;
        while(i<nums.length){
            int r =nums[i];
            if(r>fb) {
                sb=fb;
                fb=r;
            }
            else{
                if(r>sb){
                    sb=r;
                }
            }
            i++;
        }
        return (fb-1)*(sb-1);

    }
}