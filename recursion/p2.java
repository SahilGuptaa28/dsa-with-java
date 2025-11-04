import java.util.*;
class solution{
    public static void printNum(int n,int i){
        if(i>n){
        return;
    }
     printNum(n,i+1);
     System.out.println(i);
  
      
}
}

public class p2 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
      solution.printNum(n,1);
    }
}
