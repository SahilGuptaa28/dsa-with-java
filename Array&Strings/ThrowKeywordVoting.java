// import java.util.Scanner;
// class youngerAgeException extends Exception{
//     youngerAgeException(){
//         super();
//     }
//     youngerAgeException(String message){
//              super(message);
//     }
// }
// class Voting{
//     public static void main(String args[]){
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter your age :");
//        int age=s.nextInt();
//        try{
//        if(age<18){
      
//         throw new youngerAgeException("You are not eligible to vote.");
    
//        }
//        else{
//         System.out.println("You can vote.");
        
//        }
//     }
//     catch(Exception e){
//         e.printStackTrace();
//     }
//        System.out.println("program ran Successfully.");
//     }
// }
 import java.util.Scanner;

 class underAgeException extends Exception{
    underAgeException(){
        super("you are under age");
    }
    underAgeException(String msg){
        super(msg);
    }
 }
 class voting{
    public static void main(String args[]) throws underAgeException{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = s.nextInt();
        if(age<18){
          throw new underAgeException("you cannot vote bachhe");
        }else{
            System.out.println("You can vote !");
        }
    }
 }