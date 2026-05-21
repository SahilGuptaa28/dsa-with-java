class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> q = new PriorityQueue<>();
       int  x = 0;
        for(int i : arr){
            q.offer(i);
            if(q.size() > k){
                arr[x++] = q.poll();
            }
        }
        while(!q.isEmpty()){
            arr[x++] = q.poll();
        }
    }
}
