class Solution {
    public int trap(int[] height) {
        int trap = 0; int x = Integer.MIN_VALUE;
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        for(int i=0;i<height.length;i++){
           x = Math.max(x,height[i]);
           left[i] = x;
        }
        x = Integer.MIN_VALUE;
        for(int i=height.length-1;i>=0;i--){
           x = Math.max(x,height[i]);
           right[i] = x;
        }
      
      for(int i=0;i<height.length;i++){
         int min = Math.min(left[i],right[i]);
         if(height[i]<left[i] && height[i] < right[i]){
            trap += min - height[i];
         }
        }
        return trap;
    }
}


// same code without using leftmax array
class Solution {
    public int trap(int[] height) {
        int trap = 0; int x = Integer.MIN_VALUE;
        int[] right = new int[height.length];
       
        for(int i=height.length-1;i>=0;i--){
           x = Math.max(x,height[i]);
           right[i] = x;
        }
      int leftMax = Integer.MIN_VALUE;
      for(int i=0;i<height.length;i++){
       leftMax = Math.max(height[i],leftMax);
         int min = Math.min(leftMax,right[i]);
         if(height[i] < leftMax && height[i] < right[i]){
            trap += min - height[i];
         }
        }
        return trap;
    }
}