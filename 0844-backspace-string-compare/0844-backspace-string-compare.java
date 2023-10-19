class Solution {

    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(t);
        if(sb.toString().equals(sb2.toString())) return true;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(0) == '#') {
                sb.delete(0, 1);
            } else if (sb.charAt(i) == '#') {
                if (i > 0 && i < sb.length()) {
                    sb.delete(i - 1, i + 1);
                    // if(sb.length()>2){
                    i -= 2;
                    // i--;
                    // }
                }
            }
        }
        for (int i = 0; i < sb2.length(); i++) {
            if (sb2.charAt(0) == '#') {
                sb2.delete(0, 1);
            } else if (sb2.charAt(i) == '#') {
                if (i > 0 && i < sb2.length()) {
                    sb2.delete(i - 1, i + 1);
                    // i--;
                    i -= 2;
                    // i--;
                }
            }
        }
        // System.out.print(sb.toString());
        // System.out.print("=>");

        // System.out.print(sb2.toString());

        boolean x = sb.toString().equals(sb2.toString());
        // System.out.print(x);
        // return  sb.toString().equals(sb2.toString());
        return x;
    }
}
