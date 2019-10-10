package csip.solutions; 

/**
 * Given a value k, generate all well ordered numbers of length k. Well
 * ordered means that digits should be in increasing order.
 */
public class kdignumbers {

    StringBuffer out = new StringBuffer(); 
    char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    
    public void generateKDigNums(int k) {
	generateKDigNumsRec(1, k);
    }

    private void generateKDigNumsRec(int first, int k) {

	if (k == 0) {
	    System.out.println(out.toString());
	}
	else {

	    for (int i = first; i <= (10 - k); ++i) {
		out.append(nums[i]); 
		generateKDigNumsRec(i + 1, k - 1);
		out.setLength(out.length() - 1); 
	    }

	}

    }

    public static void main(String[] args) {

	KDigNumbers test = new KDigNumbers(); 
	test.generateKDigNums(7);

    }

}