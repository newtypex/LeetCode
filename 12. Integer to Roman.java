// Runtime: 4 ms, faster than 67.94% of Java online submissions for Integer to Roman.
// Memory Usage: 35.3 MB.

class Solution {
    public String intToRoman(int num) {
    	
    	int[] values = new int[] {1000, 900, 500, 400, 100, 
    			90, 50, 40, 10, 
    			9, 5, 4, 1};
    	String[] romans = new String[] {"M","CM","D","CD","C",
    			"XC","L","XL","X",
    			"IX","V","IV","I"};
    	String s = "";
    	for (int i=0; i<values.length; i++) {
    		while (num>= values[i]) {
    			num -= values[i];
    			s += romans[i];
    		}
    	}
        return s;
    }
}