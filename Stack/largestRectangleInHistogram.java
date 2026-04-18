class Solution {
    public int[] pse(int[] heights){
        Stack<Integer> s = new Stack<>();
        int[] res = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
             res[i] = s.isEmpty() ? -1 : s.peek();
             s.push(i);   
        }
        return res;
    }
     public int[] nse(int[] heights){
        Stack<Integer> s = new Stack<>();
        int[] res = new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
             res[i] = s.isEmpty() ? heights.length : s.peek();
             s.push(i);   
        }
        return res;
    }
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int[] pse = pse(heights);
        int[] nse = nse(heights);
        for(int i=0;i<heights.length;i++){
            int width = nse[i]-pse[i]-1;
            int area = width*heights[i];
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}