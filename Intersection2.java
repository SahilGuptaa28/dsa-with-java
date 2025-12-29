import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       int n1 = nums1.length;
       int n2 = nums2.length;
       ArrayList<Integer> list = new ArrayList<>();
      ArrayList<Integer> resultlist = new ArrayList<>();
       for(int i:nums1){
        list.add(i);
       }
       for(int i : nums2){
        if(list.contains(i)){
          resultlist.add(i);
           list.remove(Integer.valueOf(i));
           // removes the value i (first occurrence); list.remove(2); // removes element at index 2
        }
       }
       int[] a= new int[resultlist.size()];
       int i = 0;
       for(int val :resultlist){
        a[i++]=val;
       }
        return a;
    }
}

public class Intersection2{
    public static void main(String[] args) {
      int []  nums1 = {1,2,2,1},nums2 = {2,2};
      Solution s = new Solution();
      int[] res = s.intersection(nums1, nums2);
      System.out.println(Arrays.toString(res));

    }
}