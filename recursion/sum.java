class Solution{
    public static int sum(int n){
        if(n==0) return 0;
        return sum(n-1)+n;
    }
}
class p2{
    public static void main(String[] args) {
     int res = Solution.sum(5);
     System.out.println(res);
       
    }
}