class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int area=0;
        int right=n-1;
      while(left<=right ){
        if(left==right) {
            left++;
            right=n-1;
        }
        if(left<n && right>=0 && height[left]<=height[right] ){
           area = Math.max(area,(height[left]*(right-left)));
           right=n-1;
           left++;
        }
        else if(left<n && right>=0 && height[left]>height[right]  ){
            area=Math.max(area, (height[right]*(right-left)));
            right--;
        }
        
      }
      return area;
    }
}