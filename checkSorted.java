class solution{
    public static boolean checkIfSorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){

            }else{
                return false;
            }
        }
        return true;
    }
}
public class checkSorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,9};
        boolean res = solution.checkIfSorted(arr);
        System.out.println(res);
    }
}
