package csip.solutions; 

public class PowerSet {

    private String in; 
    private StringBuffer out;

    public PowerSet(String in) {
	this.in = in;
	this.out = new StringBuffer();
    }

    public void printAllCombos() {
	printAllCombosRec(0, in.length());
    } 

    private void printAllCombosRec(int left, int right) {

	if (left == right) {
	    return; 
	}
	else {

	    for (int i = left; i < right; ++i) {
		out.append(in.charAt(i)); 
		System.out.println(out.toString()); 
		
		printAllCombosRec(i + 1, right);

		out.setLength(out.length() - 1);
	    }

	}

    }

    public static void main(String[] args) {

	PowerSet test = new PowerSet("wxyz");
	test.printAllCombos();

    }

}