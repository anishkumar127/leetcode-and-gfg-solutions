class Solution {

    public String finalString(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'i') {
                String deleted = sb.substring(0, i);
                sb.delete(0, i + 1);
                StringBuilder del = new StringBuilder(deleted);
                del.reverse();
                sb.insert(0,del);
                // System.out.print(del);
                i = i-1;
            }
        }
        return sb.toString();
    }
}
