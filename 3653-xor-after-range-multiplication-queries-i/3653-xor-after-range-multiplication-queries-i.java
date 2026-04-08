class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length;
        int MOD = 1000000007;

        for(int i = 0; i < queries.length; i++){

            int l = queries[i][0];
            int r = queries[i][1];
            int k = queries[i][2];
            int v = queries[i][3];

            for(int idx = l; idx <= r; idx += k){
                nums[idx] = (int)(((long)nums[idx] * v) % MOD);
            }
        }

        int xor = 0;
        for(int i = 0; i < n; i++){
            xor ^= nums[i];
        }

        return xor;
    }
}