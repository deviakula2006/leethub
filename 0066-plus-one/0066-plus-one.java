class Solution {
    public int[] plusOne(int[] digit) {
        int l= digit.length;
        
        int carry =0;
        ArrayList<Integer>arr = new ArrayList<>();
        for(int i=l-1;i>=0;i--){
            if(i==l-1){
                digit[i]=digit[i]+1;
            }
            digit[i]=digit[i]+carry;
             if(digit[i]>9 && i==l-1|| digit[i]>9 && carry==1){
                carry =1;
                digit[i]=0;
            }
            else carry =0;
          arr.add(digit[i]);
           
          
        }
        if(carry==1){
            arr.add(1);
        }
     
       int arr1[]=new int[arr.size()];
    for(int i=0;i<arr.size();i++){
       arr1[i]=arr.get(arr.size()-1-i);
    }
       return arr1;
  }
    }