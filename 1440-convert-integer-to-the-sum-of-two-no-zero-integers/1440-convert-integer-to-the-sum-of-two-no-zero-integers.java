class Solution {
    public int containsZero(int n){
        while(n>0){
            if(n%10==0) return 1;
            n=n/10;
        }
        return 0;
    }
    public int[] getNoZeroIntegers(int n) {
        int arr[] =new int[2];

        for(int i=n-1;i>0;i--){
          if(containsZero(i)==0 && containsZero(n-i)==0){
            arr[0]=i;
            arr[1]=n-i;
            return arr;
          }
        }
        return arr;
    }
}