class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int m = nums.length;
        int n = queries.length;
    
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        List<Integer> list =new ArrayList<>();
         for(int i=0;i<m;i++){
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }
        for(int x:queries){
            int min = Integer.MAX_VALUE;
            List<Integer> list2=map.get(nums[x]);
           
            if(list2.size()==1){
                list.add(-1);
                continue;
            }
           
            
          int nx= Collections.binarySearch(list2,x);
        
         
          
            int cnt=0;
            int arr[]=new int[2];
             arr[0] = ( (nx - 1+list2.size() ) % list2.size());
            arr[1]= ((nx + 1) % list2.size());
            
           while(cnt<2){
            cnt++;
            int i=arr[cnt-1];
                int j=list2.get(i);
                    if(j==x ){
                        continue;
                    }
                  else if(j<x){ 
                    int mina = Math.min((x-j),(m-x+j));
                     min=Math.min(min,mina);
                      } 
                      else{ 
                      int minb=Math.min((j-x),(m-j+x)); 
                      min=Math.min(minb,min); 
                    }
                   
            }
            list.add(min) ; 
        }
        return list;
    }
}