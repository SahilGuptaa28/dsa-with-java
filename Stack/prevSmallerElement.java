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