class Solution {
    public boolean isVowel(char ch){
        if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ||ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int l=0,h=ch.length-1;
        while(l<=h){
            if(! isVowel(ch[l])){
                l++;
            }else if(! isVowel(ch[h])){
                h--;
            }else{
                char temp  = ch[l];
                ch[l] = ch[h];
                ch[h] = temp;
                l++;
                h--;
            }
        }
        return String.valueOf(ch);
    }
}
