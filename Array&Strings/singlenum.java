import java.util.*;
// class Solution {
//     public int singleNumber(int[] nums) {
//          HashMap<Integer,Integer> map = new HashMap<>();
//    for(int i:nums){
//     map.put(i, map.getOrDefault(i, 0)+1);
//    }
//    for(Map.Entry<Integer,Integer> entry:map.entrySet()){
//     if(entry.getValue()==1){
//        return entry.getKey();
//     }
// }
//         return -1;
//     }
// }
class Solution {
    public int singleNumber(int[] nums) {
    int result = 0;
    for(int i=0;i<nums.length;i++){
        result = result ^ nums[i];
    }
    return result;
    }
}
