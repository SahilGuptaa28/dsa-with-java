class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> q = new PriorityQueue<>(  (a, b) -> {
        if (a[0] == b[0]) {
            return b[1] - a[1];
        }
        return b[0] - a[0];
    });
        for(int i : arr){
            
           q.offer(new int[]{Math.abs(i-x),i});
             if(q.size() > k){
                q.poll();
             }
        }
        List<Integer> list = new ArrayList<>();
        while(!q.isEmpty()){
            int[] y = q.poll();
           list.add(y[1]);
        }
    Collections.sort(list);
     return list;
    }
}