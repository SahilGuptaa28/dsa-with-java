import java.util.*;
class solution{
    public String misM(String[] arr,String s){
    HashMap<String,Integer> map =new HashMap<>();
    for(int i=0;i<arr.length;i++){
      map.put(arr[i], arr[i].length());
    }
  for(String key: map.keySet()){
     int count=0;
    if(key.length()==s.length()){
        for(int i=0;i<key.length();i++){
          if(key.charAt(i) != s.charAt(i)){
            count++;
          }
        }
         if(count==1){
    return key;
  }
    }

  }

   return "";   
    }
}

class misMatch{
    public static void main(String[] args) {
        String[] arr = {"bana","apple","bananaa","banaba","bonazo"};
        String s="banana";
        solution sa =new solution();
        String res= sa.misM(arr, s);
        System.out.println(res);
    }
}