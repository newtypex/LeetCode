// Runtime: 23 ms -- too slow, will try to optimize later...
// Memory Usage: 38.3 MB.

class Solution {
    public static String convert(String s, int numRows) {
        
    	if (numRows==1) return s;
    	ArrayList<Character>[] lists = new ArrayList[numRows];
        for (int i=0; i<numRows;i++) {
            lists[i] = new ArrayList();
        }
    	int row = 0;
    	boolean isDownwards = true;
        char[] array = s.toCharArray();
    	for (char c : array) {
    		lists[row].add(c);

    		if (isDownwards) {
    			row += 1;
    			if (row == numRows-1) isDownwards = false;
    		}
    		else {
    			row -= 1;
    			if (row == 0) isDownwards = true;
    		}
    	}
    	
    	String output = "";
    	for (int i = 0; i<numRows; i++) {
    		for (Character digit : lists[i]) {
    			output+= digit.toString();
    		}
    	}
    	
    	return output;
    }
}