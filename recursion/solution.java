import java.util.Scanner;

   class problem1{
    public static void printName(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("sahil Gupta");
        printName(i+1, n);
    }
  }
public class solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
      problem1.printName(1,n);
    }
}
