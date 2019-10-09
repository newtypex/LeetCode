// Runtime: 0 ms, faster than 100.00% of Java online submissions for Keyboard Row.
// Memory Usage: 34.5 MB, less than 100.00% of Java online submissions for Keyboard Row.

class Solution {
    String Row1 = "qwertyuiop";
	String Row2 = "asdfghjkl";
    
	public String[] findWords(String[] words) {
		if (words==null || words.length==0) return new String[0];
		
		ArrayList<String> answer = new ArrayList<String>();
        for (String word: words) {
        	if (isOneRow(word.toLowerCase())) answer.add(word);
		}
        return (String[]) answer.toArray(new String[answer.size()]);
    }
	
	private boolean isOneRow (String word) {
		int pastRow = 0;
		int thisRow = 0;
		for (char c: word.toCharArray()) {
			if (Row1.indexOf(c)>-1) thisRow = 1;
			else if (Row2.indexOf(c)>-1) thisRow = 2;
			else thisRow = 3;
			if (thisRow != pastRow) {
				if (pastRow==0) pastRow = thisRow;
				else return false;
				}
			}
		return true;
	}
    
}