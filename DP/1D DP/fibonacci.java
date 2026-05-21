class fibonacci {

    public static int fib(int n, int[] dp){

        if(n <= 1){
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        return dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
    }

    public static void main(String[] args) {

        int n = 7;

        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        for(int i = 0; i <= n; i++){
            System.out.print(fib(i, dp) + " ");
        }
    }
}
// tabulation
public class fibonacci {

    public static void main(String[] args) {

        int n = 7;

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        for(int i = 0; i <= n; i++){
            System.out.print(dp[i] + " ");
        }
    }
}
// space optimization
class Solution {
    public int fib(int n) {

        if(n <= 1){
            return n;
        }

        int prev2 = 0;
        int prev1 = 1;

        for(int i = 2; i <= n; i++){

            int curr = prev1 + prev2;

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}