import java.util.*;
class longestSubarrayKSum{
    public static int findLongestSubArray(int[] arr,long k){
   HashMap<Long,Integer> map = new HashMap<>();
    long sum = 0;
    int maxLength = 0;
    for(int i=0;i<arr.length;i++){
        sum += arr[i];
        if(sum == k){
            maxLength = Math.max(maxLength,i+1);
        }
        long rem = sum - k;
        if(map.containsKey(rem)){
          int length = i - map.get(rem);
          maxLength = Math.max(maxLength,length);
        }
        if(!map.containsKey(sum)){
            map.put(sum,i);
        }
    }
      return maxLength;
    }
}
// import java.util.*;
// class longestSubarrayKSum{
//     public static int findLongestSubArray(int[] arr,long k){
//         int count =0;
//         for(int i=0;i<arr.length;i++){
//           int sum = 0;
//           for(int j=i;j<arr.length;j++){
//             sum += arr[j];
//             if(sum == k){
//                 count++;
//             }
//           }
//         }
//       return count;
//     }
// }








    

