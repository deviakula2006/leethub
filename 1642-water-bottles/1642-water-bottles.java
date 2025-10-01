class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum =numBottles;
        int num = numExchange;
        while(numBottles/num>0){
          int div = numBottles/num;
          if(numBottles%num ==0){
         numBottles = numBottles/num;
          }
          else {
            numBottles = numBottles/num + numBottles%num;
          }
          sum+=div;
          
        }
        return sum;
}
}