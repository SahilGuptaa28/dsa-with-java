class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        char[] chars = s.toCharArray();
        for(char c: chars){
            freq[c-'a']++;
        }
        for(int i=0;i<chars.length;i++){
            if(freq[chars[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
// class Solution {
//     public int firstUniqChar(String s) {
//         Map<Character, Integer> map = new LinkedHashMap<>();

//         // Count frequency of each character
//         for (char c : s.toCharArray()) {
//             map.put(c, map.getOrDefault(c, 0) + 1);
//         }

//         // Find the first character with frequency 1
//         for (int i = 0; i < s.length(); i++) {
//             if (map.get(s.charAt(i)) == 1) {
//                 return i;
//             }
//         }

//         return -1;
//     }
// }