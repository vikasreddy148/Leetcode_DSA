class Solution {
    public String rearrangeString(String s, char x, char y) {

        String a1 = "";
        String a2 = "";
        String a3 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == y) {
                a1 += s.charAt(i);
            }

        }
       
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != x && s.charAt(i) != y) {
                a2 += s.charAt(i);
            }

        }

         for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x) {
                a3 += s.charAt(i);
            }

        }
        return a1+ a2+a3;

    }
}