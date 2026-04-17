class Solution {
    public int Reversed(int num){
        int ans =0;
        while(num>0){
            int r = num%10;
            ans= ans*10+r;
            num=num/10;
        }
        return ans;
    }
    public int find(int key,int [] arr){
        
            for(int i=key+1;i<arr.length;i++){
           if(arr[i]==arr[key]) return i-key;
            }
            return -1;
    }
    public int minMirrorPairDistance(int[] nums) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        int min =10000001;
        int flag=0;
              for(int i=0;i<nums.length;i++){
         map.put(nums[i],i);
              }
              for(int i=0;i<nums.length;i++){
                int key = nums[i];
               int reversed=Reversed(key);
                if(map.containsKey(reversed)) {
                    int ans = map.get(reversed)-map.get(key);
                    if(ans>0) {
                        min = Math.min(min,ans);
                        flag=1;
                        System.out.println(map.get(key));
                    }
                    if(ans==0){
                       int ind =find(i,nums);
                       if(ind !=-1) {
                          min = Math.min(min,ind);
                          flag=1;
                       }
                    } 
                }
              }
              if(flag==0) return -1;
              return min;
    }
}