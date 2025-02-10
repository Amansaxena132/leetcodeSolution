class Solution {
    public String reverseWords(String s) {

        String sp[] = s.trim().split("\\s+"); 
        StringBuilder g = new StringBuilder();

        for (int i = sp.length - 1; i >= 0; i--) {
            g.append(sp[i]);
            if (i > 0) {
                g.append(" "); 
            }
        }

        return g.toString();
    }
}