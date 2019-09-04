package csip.solutions.upperClassPerson;

import java.util.Map; 
import java.util.Set; 
import java.util.HashMap; 
import java.util.HashSet; 

public class CodeWords {


    public boolean isValid(String sentence, String code) {
	String[] words = sentence.split(" ");
	char[] codes = code.toCharArray();
	Map<Character, String> codeMap = new HashMap<>();
	Set<String> wordSet = new HashSet<>();

	if (words.length != codes.length) { return false; };

	for (int i = 0; i < words.length; ++i) {

	    if (codeMap.get(codes[i]) != null) {
		
		if (codeMap.get(codes[i]) != words[i]) {
		    return false; 
		}

	    }
	    else if (wordSet.contains(words[i])) {
		return false; 
	    }

	    codeMap.put(codes[i], words[i]);
	    wordSet.add(words[i]);
	}

	return true; 
    }






}