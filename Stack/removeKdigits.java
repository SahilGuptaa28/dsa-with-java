class Solution {
    public String removeKdigits(String num, int k) {
    Stack<Character> s = new Stack<>();
    if(k== num.length()) return "0";
    for(int i=0;i<num.length();i++){
        char ch = num.charAt(i);
        while(!s.isEmpty() && ch-'0' < s.peek() - '0' && k>0){
            s.pop();
            k--;
        }
        s.push(ch);
    }
    while(k>0){
        s.pop();
        k--;
    }
    StringBuilder sb = new StringBuilder();
  while(!s.isEmpty()){
    sb.append(s.pop());
}
    String str = sb.reverse().toString();
     str = str.replaceFirst("^0+(?!$)", "");
    return str;
    }
}