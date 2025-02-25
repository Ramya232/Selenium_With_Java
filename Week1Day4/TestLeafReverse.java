package Week1Day4;

public class TestLeafReverse {

	public static void main(String[] args) {
						      
	        String s = "TestLeaf"; 
	        String r = "";
	        char ch;
        for (int i = 0; i < s.length(); i++) {
	                      
	            ch = s.charAt(i);
			     r = ch + r; 
	        }
	      
	        System.out.println(r);
	    }
	

	}


