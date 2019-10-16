package csip.solutions; 

public class TrimString {

    public static String trim(String str) {

	if (str == null) { return null; }

	int beg = 0; 
	int end = str.length() - 1; 

	while (beg <= end) {

	    if (str.charAt(beg) != ' ' && str.charAt(end) != ' ') {
		return str.substring(beg, end + 1); 
	    }

	    if (str.charAt(beg) == ' ') {
		beg++;
	    }

	    if (str.charAt(end) == ' ') {
		end--; 
	    }

	}

	return ""; 
    }

    public static void main(String[] args) {
        
        String[] tests = {"       yup it works     ",
			  "noleft         ", 
			  "                 no right",
			  "  x   ",
			  "", 
			  "         "
	                 };
        
        for (String test : tests) {
            
            System.out.println("Original: " + test + " length: " + test.length());
            System.out.println("Stripped: " + trim(test) + " length: " + trim(test).length());
            
        }
        
        
    }


}