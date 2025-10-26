class Solution {
    public int totalMoney(int n) {
        int add =0;
        int sum=0;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(i%7==0) {
                cnt++;
                add=0;
            }
            sum = sum+=cnt+add;
            add++;

        }
        return sum;
    }
}