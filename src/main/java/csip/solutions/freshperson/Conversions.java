package csip.solutions.freshperson;

import java.util.Map;
import java.util.HashMap;

public class Conversions {

    public int strToInt(String s) {
	int val = 0;
	Map<Character, Integer> map = buildCharMap();

	for (int i = 0; i < s.length(); ++i) {
	    val *= 10; 
	    val += map.get(s.charAt(i));
	}
	
	return val;
    }

    private HashMap<Character, Integer> buildCharMap() {
	String s = "0123456789";
	HashMap<Character, Integer> map = new HashMap<>();

	for (int i = 0; i < s.length(); ++i) {
	    map.put(s.charAt(i), i);
	}

	return map; 
    }

    public String intToString(int x) {
	int digits = ((int) Math.log(x)) + 1; 
	char[] ret = new char[digits];
	Map<Integer, Character> map = buildIntMap();
	int i = digits - 1; 

	while (x != 0) {
	    int digit = x % 10; 
	    ret[i--] = map.get(digit);
	    x /= 10; 
	}

	return new String(ret);
    }

    private HashMap<Integer, Character> buildIntMap() {
	String s = "0123456789";
	HashMap<Integer, Character> map = new HashMap<>();

	for (int i = 0; i < s.length(); ++i) {
	    map.put(i, s.charAt(i));
	}

	return map; 
    }

    public static void main(String[] args) {
	Conversions conv = new Conversions();


	String t = "1447";
	int tInt = conv.strToInt(t);
	System.out.println("Original String: " + t + " Integer Conversion: " + tInt);

	int u = 100420;
	String uStr = conv.intToString(u);
	System.out.println("Original Int: " + u  + " String Conversion: " + uStr);
    }

}