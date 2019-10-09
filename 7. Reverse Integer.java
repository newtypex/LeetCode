// Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse Integer.
// Memory Usage: 32.7 MB, less than 22.22% of Java online submissions for Reverse Integer.

class Solution {
    public int reverse(int x) {
        
        int LIMIT = (int)Math.pow(2,31);
        
        int output = 0;
        boolean isNegative = false;
        if (x<0) {
            isNegative = true;
            x = 0 - x;
        }
        
        while (x>0) {
        	if (output>LIMIT/10 || output<LIMIT/(-10)) return 0;
            int lastDigit = x%10;
            x = x / 10;
            output = output*10 + lastDigit;
        }
        
        if (isNegative) output = output*(-1);
        return output;
    }
}
