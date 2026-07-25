class Solution {
    public int maxProduct(int n) {
        int fb=0;
        int sb =0;
        while(n>0){
            int r =n%10;
            if(r>fb) {
                sb=fb;
                fb=r;
            }
            else{
                if(r>sb){
                    sb=r;
                }
            }
            n/=10;
        }
        return fb*sb;

    }
}