class Solution {
    public boolean isVowel(char ch){
        if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u' ){
                return true;
            }
            return false;
    }
    public int maxVowels(String s, int k) {
        int l = 0; int r = k-1; int maxVowel = 0; int count = 0;
        for(int i=l;i<=r;i++){
            
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        maxVowel = count;
        while(r<s.length()-1){
              r++;
             if(isVowel(s.charAt(r-k))){
                 count--;
             }
              if(isVowel(s.charAt(r))){
                count++;
               
              }
               maxVowel = Math.max(maxVowel,count);
        }
        return maxVowel;
    }
}