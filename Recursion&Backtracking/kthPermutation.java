// Brute force will be generate all the permutation store in a list sort the list return the k-1 permutation; 
class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList<>();
        int fact = 1;

        // prepare numbers and (n-1)!
        for (int i = 1; i < n; i++) {
            fact *= i;
            list.add(i);
        }
        list.add(n);

        k = k - 1;
        StringBuilder s = new StringBuilder();

        while (true) {
            int index = k / fact;
            s.append(list.get(index));
            list.remove(index);

            if (list.size() == 0) {
                break;
            }

            k = k % fact;
            fact = fact / list.size();
        }

        return s.toString();
    }
}