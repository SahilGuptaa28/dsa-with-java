import java.util.*;
class Solution {
    public ArrayList<Integer> intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> set = new HashSet<>();
       HashSet<Integer> resultSet = new HashSet<>();
       for(int i:nums1){
        set.add(i);
       }
       for(int i : nums2){
        if(set.contains(i)){
          resultSet.add(i);
        }
       }
      return new ArrayList<>(resultSet);
    }
}

public class Intersection{
    public static void main(String[] args) {
      int []  nums1 = {1,2,2,1},nums2 = {2,2};
      Solution s = new Solution();
      int[] res = s.intersection(nums1, nums2);
      System.out.println(Arrays.toString(res));

    }
}
