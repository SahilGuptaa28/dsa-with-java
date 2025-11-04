 import java.util.*;
 class solution {
    public List<Integer> majorityElement (int[] nums) {
       int n = nums.length;
     HashMap<Integer,Integer> map = new HashMap<>();
         List<Integer> list = new ArrayList<>();
       for(int i=0;i<n;i++){
       if(map.containsKey(nums[i])){
         map.put(nums[i], map.get(nums[i])+1);
       }else{
        map.put(nums[i], 1);
       }
       }

       for(int key : map.keySet()){
        if(map.get(key)>n/3){
          list.add(key);
        }
       }
     
      return list;
    }
}
 public class majority{
    public static void main(String[] args) {
       int[]  arr = {3,2};
       solution obj = new solution();
       List<Integer> res = obj.majorityElement(arr);
       System.out.println(res);

    }
 }