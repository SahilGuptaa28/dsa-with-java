import java.util.Scanner;

 class underAgeException extends RuntimeException{
    underAgeException(){
        super("you are under age");
    }
    underAgeException(String msg){
        super(msg);
    }
 }
 class voting{
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = s.nextInt();
       try{ 
        if(age<18){
          throw new underAgeException();
        }else{
            System.out.println("You can vote !");
        }
    }catch(underAgeException e){
        e.printStackTrace();
    }
     System.out.println("Program ran successfully");
    
    }
 }