import java.util.Scanner;
public class palindrome {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = s.nextLine();
        String rev = "";
        for(int i = str.length()-1; i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);

        if(str.equals(rev)){
            System.out.println("palindrome !");
        }else{
            System.out.println("not palindrome !");
        }
        
    }
}
