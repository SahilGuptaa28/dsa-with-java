// q no 1209 ; New Concept  using a custom Pair
class Solution {
    class Pair {
        char ch;
        int count;

        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack = new Stack<>();
        for(char ch : s.toCharArray()){
           if(!stack.isEmpty() && stack.peek().ch == ch){
               stack.peek().count ++;
                if(stack.peek().count == k) stack.pop();
           }else{
            stack.push(new Pair(ch,1));
           }
        }
        StringBuilder sb = new StringBuilder();
        while( !stack.isEmpty()){
            Pair p = stack.pop();
            for(int i=0;i<p.count;i++){
                sb.append(p.ch);
            }
        }
        return sb.reverse().toString();
    }
}