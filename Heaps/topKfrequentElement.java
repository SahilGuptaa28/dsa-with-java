class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // ((a,b)-> a.getValue() - b.getValue()) sort in increasing order of frequency
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            minHeap.offer(e);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] res = new int[k];
        int x = 0;
        while (!minHeap.isEmpty()) {
            Map.Entry<Integer, Integer> e = minHeap.poll();
            int val = e.getKey();
            res[x++] = val;
        }
        return res;
    }
}