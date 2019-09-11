package csip.solutions.lowerClassPerson; 

public class NineEleven {

    public static Node nthToLast(Node head, int n) {

	Node curr = head; 
	Node prev = head; 

	while (curr.next != null) {
	    curr = curr.next; 

	    if (n == 0) {
		prev = prev.next;
	    }
	    else {
		n--;
	    }

	}
	
	return prev; 
    }

    public static void printDesc(String sentence) {

	if (sentence == null) {
	    return; 
	}

	String[] sent = sentence.split(" ");

	if (sent.length == 0) { return;  }

	printDescRec(sent, sent.length);

    }

    private static void printDescRec(String[] words, int bound) {

	if (bound == 1) {
	    printLine(words, bound);
	}
	else {
	    printLine(words, bound);
	    printDescRec(words, bound - 1); 
	    printLine(words, bound);
	}

    }

    private static void printLine(String[] words, int bound) {

	for (int i = 0; i < bound, ++i) {
	    System.out.print(words[i] + " "); 
	}
	System.out.println("");
    }

}