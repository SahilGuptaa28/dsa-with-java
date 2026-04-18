//Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
class Solution {
    public boolean judgeSquareSum(int c) {
        int low= 0 ; int high = (int)Math.sqrt(c);
        while(low<=high){
              long sum = (long) low * low + (long) high * high;
            if(sum == c){
                return true;
            }else if(sum< c){
                low++;
            }else{
                high--;
            }
        }
        return false;
    }
}