import java.util.*;
class Solution {
    public int longestConsecutive(int[] arr) {
        int n=arr.length;
        if(n==0) return 0;
        int longest = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
      for(int no : set){
        if(! set.contains(no-1)){
            int count = 1;
            int x = no;
            while(set.contains(x+1)){
                count++;
                x++;
            }
            longest = Math.max(count, longest);
        }
      }
        return longest;
        
    }
}
// brute force.....

// public class tUf {
//     public static int longestSuccessiveElements(int []a) {
//         int n = a.length;
//         if (n == 0) return 0;

//         //sort the array:
//         Arrays.sort(a);
//         int lastSmaller = Integer.MIN_VALUE;
//         int cnt = 0;
//         int longest = 1;

//         //find longest sequence:
//         for (int i = 0; i < n; i++) {
//             if (a[i] - 1 == lastSmaller) {
//                 //a[i] is the next element of the
//                 //current sequence.
//                 cnt += 1;
//                 lastSmaller = a[i];
//             } else if (a[i] != lastSmaller) {
//                 cnt = 1;
//                 lastSmaller = a[i];
//             }
//             longest = Math.max(longest, cnt);
//         }
//         return longest;
//     }
