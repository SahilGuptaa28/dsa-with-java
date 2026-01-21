class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int maxlen = 0;

        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);

            // duplicate found inside window
            if (map.containsKey(ch) && map.get(ch) >= l) {
                l = map.get(ch) + 1;
            }

            maxlen = Math.max(maxlen, r - l + 1);

            // update last seen index
            map.put(ch, r);
        }
        return maxlen;
    }
}

// one more method
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        int n = s.length();
        Arrays.fill(hash, -1);
        int l = 0;
        int r = 0;
        int maxlen = 0;
        while (r < n) {
            if (hash[s.charAt(r)] >= l) {
                l = Math.max(hash[s.charAt(r)] + 1, l);
            }
            maxlen = Math.max(maxlen, r - l + 1);
            hash[s.charAt(r)] = r;
            r++;
        }
        return maxlen;
    }
}
