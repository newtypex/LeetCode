// Runtime: 21 ms - needs improvement!
// Memory Usage: 35.7 MB

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int siz = s.length();
        if (siz<2) return true;
        char[] arrs = s.toCharArray();
        char[] arrt = t.toCharArray();
        boolean[] checked = new boolean[siz];
        
        for (int i=0; i<siz-1; i++) {
            if (checked[i]) continue;
            for (int j=i+1; j<siz; j++) {
                if (arrs[i]==arrs[j]) {
                    if ((arrt[i]!=arrt[j])) return false;
                    checked[j] = true;
                }
                else if (arrt[i]==arrt[j]) return false;
            }
            checked[i] = true;
        }
        return true;
    }
}