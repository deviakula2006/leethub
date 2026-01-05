class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int n= nums[i];
            int cnt=0;
            int dum=0;
           int num = (int)Math.sqrt(n);
            for(int j=2;j<=num;j++){
                if(n%j==0 && j!=nums[i]){

                cnt++;
                dum+=j;
                if(n/j !=j) {
                     cnt++;
                dum+=(n/j);
                }
               
                }
               
            }
            if(cnt==2){
 sum+=dum+nums[i]+1;
 System.out.println(sum);
            }
        }
        return sum;
    }
}