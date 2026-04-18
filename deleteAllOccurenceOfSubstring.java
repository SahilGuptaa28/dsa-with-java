class Solution {
    public String removeOccurrences(String s, String part) {
        int k = part.length();
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            sb.append(ch);

            if(sb.length()>=k){
               String last =  sb.substring(sb.length()-k);
               if(last.equals(part)){
                       sb.delete(sb.length() - k, sb.length());
               }
            }
        } 
        return sb.toString();
    }
}