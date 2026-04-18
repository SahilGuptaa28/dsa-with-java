import java.util.Scanner;
public class MaxOccurring {
    public static void main(String args[]) {
        int[] arr = new int[256];
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the string");
        String str = s.nextLine();
        int maxCount = -1;
        char maxChar = ' ';
        str = str.toLowerCase(); 
       for(int i=0;i<str.length();i++){
           arr[str.charAt(i)]++;
       }

       for(int i=0;i<str.length();i++){
        if(maxCount < arr[str.charAt(i)] ) {
            maxCount = arr[str.charAt(i)];
            maxChar = str.charAt(i);
        }else if (arr[str.charAt(i)] == maxCount && str.charAt(i) < maxChar){
                 maxChar = str.charAt(i);
        }

       }
       System.out.println("maximum occurence element is "+maxChar+" : "+maxCount);
    }
}

