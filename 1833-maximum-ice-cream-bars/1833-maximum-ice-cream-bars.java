class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i=1;
        int cnt=1;
        int sum=costs[0];
        if(sum>coins) return 0;
        while(sum<coins && i<costs.length){
            if(sum+costs[i]<=coins) {sum=sum+costs[i]; cnt++;}
            else return cnt;
            i++;
        }
        return cnt;
    }
}