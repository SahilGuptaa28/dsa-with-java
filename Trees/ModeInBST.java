class Solution {
    int maxCount = 0;
    int count = 0;
    int prev = Integer.MAX_VALUE;
    List<Integer> list = new ArrayList<>();

    public void solve(TreeNode node) {
        if (node == null)
            return;
        solve(node.left);
        if (node.val == prev) {
            count++;
        } else {
            prev = node.val;
            count = 1;
        }
        if (count > maxCount) {
            maxCount = count;
            list.clear();
            list.add(node.val);
        } else if (count == maxCount) {
            list.add(node.val);
        }
        solve(node.right);
    }

    public int[] findMode(TreeNode root) {
        solve(root);
        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}