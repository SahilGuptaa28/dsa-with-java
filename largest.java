class solution{
    public static void findLargest(int[] arr){
        int largest=Integer.MIN_VALUE;
         int slargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
               
            }else if(arr[i]<largest && arr[i]>slargest){
                slargest = arr[i];
            }
        }
        System.out.println("largest is "+largest+"second largest is "+slargest);
    }
      public static void findSmallest(int[] arr){
        int smallest=Integer.MAX_VALUE;
         int sSmallest= Integer.MAX_VALUE;;
        for(int i=0;i<arr.length;i++){
           if(arr[i]<smallest){
            sSmallest = smallest;
            smallest = arr[i];
           }else if(arr[i]!=smallest && arr[i]<sSmallest){
            sSmallest = arr[i];
           }
        }
        System.out.println("smallst is "+smallest+"second smallest is "+sSmallest);
    }

}


public class largest {
    public static void main(String[] args) {
        int [] arr={1,4,-9,3,4,5,9};
       solution.findLargest(arr); 
       solution.findSmallest(arr);
      
    }
}
