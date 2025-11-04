import java.util.*;

class Solution {
    // Returns union of two arrays as a List of unique elements
    public ArrayList<Integer> unionOfArray(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();

       
        for (int num : a) {
            set.add(num);
        }

       
        for (int num : b) {
            set.add(num);
        }

       
        return new ArrayList<>(set);
    }
}


// for union of two  sorted arrays use treeset; 
public class Union {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3};
        int[] b = {3, 4, 5};

        Solution ob = new Solution();
        ArrayList<Integer> result = ob.unionOfArray(a, b);

        System.out.println("Union of the arrays: " + result);
    }
}

