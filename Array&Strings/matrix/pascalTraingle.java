class Solution {

    public List<Integer> generateRow(int row) {

        List<Integer> list = new ArrayList<>();

        long ans = 1;

        list.add(1);

        for(int i = 1; i <= row; i++) {

            ans = ans * (row - i + 1);
            ans = ans / i;

            list.add((int)ans);
        }

        return list;
    }

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {

            ans.add(generateRow(i));
        }

        return ans;
    }
}