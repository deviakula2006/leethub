class Solution {
    public int []  findj(int []height, int i){
        int j = i+1;
        int arr[]=new int[2];
        arr[0]=-1;
        arr[1]=0;
        int max=Integer.MIN_VALUE;
        int sum=0;
        boolean flag=false;
        
while(j<height.length){
    if(height[j]<height[i]){
        sum+= height[i]-height[j];
        if(height[j]>max){
            max=height[j];
           arr[0]=j;
        arr[1]=sum; 
        }
       // System.out.println(sum);
    }
    else {
        arr[0]=j;
        arr[1]=sum;
        flag=true;
        break;
    }
    j++;
}
System.out.println(i+ " "+arr[0]);

if(!flag) {
    arr[1]=0;
    int k = arr[0]-1;
    while(k>i){
         arr[1]+=height[arr[0]]-height[k];
         k--;
    }
}

System.out.println(arr[0]+ " "+ arr[1]) ;
return arr;
    }
    public int trap(int[] height) {
        int n = height.length;
        int i=0;
        int max =0;
        boolean start=true;
        while(i<n){
            if(start && height[i]==0) {
                i++;
                continue;
            }
            if(start && height[i]>0) start=false;
    int arr []=findj(height,i);
    if(arr[0]!=-1){
        max+=arr[1];
        i=arr[0];
    }
       else i++;
        }
        return max;
    }
}