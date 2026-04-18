// import java.util.*;
// class solution{
//     public static void swap(int[] arr,int i,int j){
//         int temp = arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//     }
//     public static void revArray(int[] arr,int i,int n){
//      if(i>=n/2)  return;
//      swap(arr,i,n-i-1);
//      revArray(arr,i+1,n);  
//     }
// }

// public class revarray {
//     public static void main(String[] args) {
//         int[] arr={1,2,3,4,5};
//         solution.revArray(arr,0,5);
//         System.out.println(Arrays.toString(arr));
//     }
// }

class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
         return check(s, 0);
        
    }
      private boolean check(String s, int i){
        int n=s.length();
            if(i>=n/2) return true;
            if(s.charAt(i)!=s.charAt(n-i-1)){
                      return false;
            }
            return check(s,i+1);
      }

}

class revarray{
    public static void main(String[] args) {
        Solution s=new Solution();
        boolean res = s.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(res);
    }
}