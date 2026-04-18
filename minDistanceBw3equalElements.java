//3740

class Solution {
    public int minimumDistance(int[] nums) {
        if (nums.length < 3) return -1;

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }

            map.get(nums[i]).add(i);
        }

        int mindist = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = map.get(nums[i]);

            if (list.size() >= 3) {
                for (int j = 0; j <= list.size() - 3; j++) {
                    int a = list.get(j);
                    int b = list.get(j + 1);
                    int c = list.get(j + 2);

                    int dist = Math.abs(a - b)
                             + Math.abs(b - c)
                             + Math.abs(c - a);

                    mindist = Math.min(dist, mindist);
                }
            }
        }

        return (mindist == Integer.MAX_VALUE) ? -1 : mindist;
    }
}
