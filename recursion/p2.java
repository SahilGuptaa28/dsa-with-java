import java.util.*;
class solution{
    public static void sum(int n){   
        if(n==0){
        return ;
    }

     
    System.out.println(n); 
    sum(n-1);1 
}
}

public class p2 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
       solution.sum(n);
       
    }
}
