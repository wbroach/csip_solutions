package csip.solutions.lowerClassPerson;

import java.util.Map;
import java.util.HashMap; 

public class TwoSum {

    public static int[] sumIdxs (int[] nums, int sum) {
	Map<Integer, Integer> map = new HashMap<>(); // key: element value value: index of value
	
	for (int i = 0; i < nums.length; ++i) {
	    map.put(nums[i], i);
	}

	int[] ret = new int[2];
	for (int i = 0; i < nums.length; ++i) {
	    int elem = nums[i];

	    if (map.get(sum - elem) != null) {
		ret[0] = i; 
		ret[1] = map.get(sum - elem); 
		return ret; 
	    }
	}

	return null;
    }
    
    public static void main(String[] args) {

	int[] test = { 1, 5, 44, 7, 4, 2, 0, 1069 }; 
	int[] idx9 = sumIdxs(test, 9);

	for (int x : idx9)
	    System.out.println(x);

	int[] test2 = { 1, 2, 3, 5, 5, 5 };
	int[] idxNull = sumIdxs(test2, 9);
	System.out.println(idxNull); 

    }

}