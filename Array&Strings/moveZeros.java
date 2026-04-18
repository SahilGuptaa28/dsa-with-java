import java.util.*;
// public class moveZeros {
//     public void moveZeroesToEnd(int[] arr){
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i:arr){
//             if(i!=0){
//                 list.add(i);
//             }                     Brute Force !
//         }
//     int nonZero = list.size();
//     for(int i=0;i<nonZero;i++){
//         arr[i]=list.get(i);
//     }
//     for(int i=nonZero;i<arr.length;i++){
//         arr[i]=0;
//     }
  
//     }
// }
public class moveZeros {
    public void moveZeroesToEnd(int[] arr){
       int j =-1;
       for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            j=i;
        break;
        }
       }
       if(j==-1) return;
       for(int i=j+1;i<arr.length;i++){
        if(arr[i]!=0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
       }
  
    }
}