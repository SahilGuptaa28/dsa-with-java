import java.util.*;
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list  = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=maxi){
                list.add(arr[i]);
                maxi = arr[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
}
