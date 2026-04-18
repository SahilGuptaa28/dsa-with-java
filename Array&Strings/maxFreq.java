import java.util.*;
class solution{
  public static int maxxFreq(int[] nums){
         int maxfreq=nums[0];
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<nums.length;i++){
        map.put(nums[i],1);
      }
    for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
        }
    }
     for(int i=0;i<nums.length;i++){
       if(map.get(nums[i])>map.get(nums[i+1])) return maxfreq= nums[i];
          else{
          return maxfreq = nums[i+1];
          }
    }
    return 0;
  }
}