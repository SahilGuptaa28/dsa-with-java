class Solution {
    public int myAtoi(String s) {
        String s1 = s.trim();
        if (s1.length() == 0)
            return 0;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (s1.charAt(i) == '+' || s1.charAt(i) == '-') {
            sb.append(s1.charAt(i));
            i++;
        }
        while (i < s1.length() && s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
            sb.append(s1.charAt(i));
            i++;
        }
        if (sb.length() == 0 || sb.toString().equals("+") || sb.toString().equals("-")) {
            return 0;
        }

        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return sb.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}