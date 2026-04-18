 public int[] nse(int[] heights){
        Stack<Integer> s = new Stack<>();
        int[] res = new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
             res[i] = s.isEmpty() ? -1 : s.peek();
             s.push(i);   
        }
        return res;
    }