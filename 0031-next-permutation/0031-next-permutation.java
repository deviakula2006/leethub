class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                ind=i;
                break;
            }
        }
        if(ind == -1)  Arrays.sort(arr);
        else{
        List<Integer> list =new ArrayList<>();
        int max=100001;
        int min=-1;
        for(int i=ind;i<n;i++){
            list.add(arr[i]);
                  if(arr[i]>arr[ind]){
                    if(arr[i]<max){
                        max=arr[i];
                        min = i;
                    }
                  }
        }
        arr[ind]=arr[min];
        list.remove(min-ind);
        Collections.sort(list);
        int cnt=0;
        for(int i=ind+1;i<n;i++){

            arr[i]=list.get(cnt);
            cnt++;
        }
        }
    }
    }