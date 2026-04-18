
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
        LinkedHashMap<Integer,List<Integer>> map = new LinkedHashMap<>();
        int min =Integer.MAX_VALUE;
        int flag=0;
              for(int i=0;i<nums.length;i++){
         map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
              }
              for(int i=0;i<nums.length;i++){
                int key = nums[i];
               int reversed=Reversed(key);
                if(map.containsKey(reversed)) {
                    List<Integer> list2 = map.get(reversed);
                    int j =0;
                    
                 
                    while(j<list2.size()){
                        if(list2.get(j)>i){
                           min =Math.min(min, list2.get(j)-i);
                           System.out.println(min);
                   
                           break;
                        }
                        list2.remove(j);
                        j=0;
                    }
                   
                       }
                    } 
               
              
              if(min==Integer.MAX_VALUE) return -1;
              return min;
    }
}