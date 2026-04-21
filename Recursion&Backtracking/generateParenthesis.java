class Solution {
    public void generate(List<String> list , int open, int close, String s, int n){
        if(s.length() == 2*n){
            list.add(s);
            return;
        }
        if(open < n){
            generate(list,open+1,close, s+'(', n);
        }
        if(close < open){
            generate(list,open,close+1,s+')',n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        String s = new String();
        generate(list,0,0,s,n);
        return list;
    }
}