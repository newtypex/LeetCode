// Runtime: 1 ms, faster than 100.00% of Java online submissions for Restore IP Addresses
// Memory Usage: 36.5 MB, less than 100.00% of Java online submissions for Restore IP Addresses.

// NOTE: don't forget that "1.00.1.1" is invalid!
class Solution {    
    
    public List<String> restoreIpAddresses(String s) {
        
    	ArrayList<String> list = new ArrayList<String>();
    	for (int i=1; i<4; i++) {
    		if (s.length()<i+3) break;
    		if (isValid(s.substring(0, i))) {
    			for (int j=1;j<4; j++) {
    				if (s.length()<i+j+2) break;
    				if (isValid(s.substring(i, i+j))) {
    					for (int k=1;k<4;k++) {
    						if (s.length()<i+j+k+1) break;
    						if (isValid(s.substring(i+j, i+j+k)) && isValid(s.substring(i+j+k))) {
    							list.add(s.substring(0,i)+"."+s.substring(i,i+j)+"."+s.substring(i+j,i+j+k)+"."+s.substring(i+j+k));
    						}
    					}
        			}
        		}
    		}
    		
    	}
    	
    	return list;
    }
    
    private boolean isValid (String s) {
    	if (s.length()>3) return false;
    	int val = Integer.parseInt(s);
    	if (val <256) {
    		if (val<10) return (s.length()==1)?true:false;
    		else if (val<100) return (s.length()==2)?true:false;
    		else return true;
    	}
    	else return false;
    }