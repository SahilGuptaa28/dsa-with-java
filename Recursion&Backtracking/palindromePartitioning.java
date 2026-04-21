class Solution {
    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        while (low <= high) {
            if (s.charAt(low) == s.charAt(high)) {
                low++;
                high--;
            } else {
                return false;
            }
        }
        return true;
    }

    public void part(List<List<String>> ans, List<String> list, String s, int idx) {
        if (idx == s.length()) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = idx; i < s.length(); i++) {
            String sub = s.substring(idx, i + 1);

            if (isPalindrome(sub)) {
                list.add(sub);
                part(ans, list, s, i + 1);
                list.remove(list.size() - 1);
            }
        }

    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        part(ans, list, s, 0);
        return ans;
    }
}