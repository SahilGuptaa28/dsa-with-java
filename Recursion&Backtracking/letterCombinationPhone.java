class Solution {
    public void solve(String digits,int idx,String[] map ,StringBuilder current, List<String> result){
        if(idx == digits.length()){
            result.add(current.toString());
            return;
        }
        int digit = digits.charAt(idx) - '0';
        String letters = map[digit];
        for(char ch : letters.toCharArray()){
            current.append(ch);
            solve(digits,idx+1,map,current,result);
            current.deleteCharAt(current.length()-1);
        }

    }
    public List<String> letterCombinations(String digits) {
         List<String> result = new ArrayList<>();

        if (digits.length() == 0) return result;

        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        solve(digits, 0, map, new StringBuilder(), result);

        return result;
    }
}