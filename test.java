// public class test{
//   public static void main(String args[]){
//      int a = 10,b = 20;
//      System.out.println(a+b);
//      String s = String.valueOf(a);
//      System.out.println(s+b);
//      String s1 = "sahil";
//      char[] c = s1.toCharArray();
//      System.out.println(c);
     

  
// }

// }
class test{
  static int diff(int m,int n){
      
        int k=0,j=0;
        int totalDivNums = 0,totalNotDivNums = 0;
        int diff = 0;
        for(int i=1;i<n;i++){
            if(i%m==0){
               totalDivNums += i;
            }else{
               totalNotDivNums +=i;
            }
        }
        diff = totalNotDivNums - totalDivNums;
        return diff;

    }
     public static void main(String[] args) {
        int result = diff(6, 30);
        System.out.println(result);
    }

}
