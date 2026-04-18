class solution{
    public static int fib(int n){
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);

    }
} 
public class fibonacci {
    public static void main(String[] args) {
        int res = solution.fib(4);
        System.out.println(res);
    }
}
