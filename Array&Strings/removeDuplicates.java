import java.util.*;
class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
         HashSet<Integer> set = new HashSet<>();
         for(int i : arr){
            set.add(i);
         }
         ArrayList<Integer> al = new ArrayList<>(set);
        return al;
    }
}



public class removeDuplicates {
    public static void main(String[] args) {
       int arr[] = {2, 2, 3, 3, 7, 5};
       Solution s= new Solution();
      ArrayList<Integer> a= s.remDuplicate(arr);
      System.out.println(a);

    }
}
