# CSIP 11/6/2019

Please [Check in here](https://docs.google.com/forms/d/e/1FAIpQLScmmgOxU1sxZPqFstweD_qU8C_eu0MtK6wn3BajnftPz6j7_A/viewform?usp=sf_link)



## Conceptual Problems

   Today will focus on a random assortment of computer science algorithms and data structures, and at the end have a few higher level questions. 

.

.

.

.

.

.

.

.

.

.


## Question 1 -- 1301/1302/1730
   Performe a bubble sort of an integer array without using a swap variable.
   Additional: What modification to a bubble sort allows it to take less than O(n^2) time if the array is sorted?
   
## Question 2 -- 1301/1302/1730
   Check if a string is an anagram of another string. That is, check if both strings contain all the same letters, just in a different order.
      Anagram(pots, stop) = true
      Anagram(pots, stap) = false
   
## Question 3 -- 2720+
   Find the length of a linked list, only iterate once. Write it both iteratively and recursively.
      For those of you that have finished data structures, the above should take you maybe 3 minutes to do both, if the interviewer has already provided you with a linked list structure. For those of you in Data structures, it is a good test of knowledge.
      
## Question 4 -- 2720+
   Find the beginning node of a loop in a linked list. For example:
   
      N1 -----> N2 ------> N3
                /\         |
                |          |
                |          \/
                N5 <------ N4
                
      would return N2.
      
      
## Question 5
   Explain a possible problem with multiclass inheritance.
   
## Question 6
   Explain polymorphism, and walk me through an example of polymorphic behavior.
   
.

.

.

.

.

.

.

.

.

## Q1 Answer

static void bubbleSort(int arr[], int n) { 
        int i, j; 
        boolean swapped; 
        for (i = 0; i < n - 1; i++)  
        { 
            swapped = false; 
            for (j = 0; j < n - i - 1; j++)  
            { 
                if (arr[j] > arr[j + 1])  
                { 
                    // swap arr[j] and arr[j+1] 
                    arr[j] = arr[j] + arr[j+1]; 
                    arr[j+1] = arr[j] - arr[j+1]; 
                    arr[j] = arr[j] - arr[j+1]; 
                    swapped = true; 
                    
                    /* Example
                    j = 10, j+1 = 20
                    
                    j = j + j+1; // 10 = 10 + 20; // j = 30
                    j+1 = j - j+1; // 20 = 30 - 20 // j+1 = 10
                    j = j - j+1; // 30 = 30 - 10 // j = 20
                    
                    j = 20, j+1 = 10
                    */
                } 
            } 
  
            /* IF no two elements were
            swapped by inner loop, then break */
            if (swapped == false) 
                break; 
        } 
    } 
    
## Q2 Answer
    public static boolean isAnagram(String word, String anagram){
        if(word.length() != anagram.length()) {
            return false;
        }
        char[] chars = word.toCharArray();
        for(char c : chars) {
            int index = anagram.indexOf(c);
            if(index != -1) {
	    	anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
	    } else {
                return false;
	    }
        }
        return anagram.isEmpty();
    }

}

## Q3 Answer

// ITERATIVE
public int length(){ 
   int count=0; 
   Node current = this.head; 
   while(
      current != null) { 
         count++; 
         current=current.next() 
      } 
   return count; 
}

// RECURSIVE
public int length(Node current) { 
   if(current == null) { 
      //base case 
      return 0; 
   } 
   return 1+length(current.next()); 
}

## Q4 Answer
public Node findStartNodeOfTheLoop() {
	Node fastPtr = head;
	Node slowPtr = head;
	boolean loopExists=false;
	while (fastPtr != null && fastPtr.next != null) {
		fastPtr = fastPtr.next.next;
		slowPtr = slowPtr.next;
		if (slowPtr == fastPtr)
		{
			loopExists=true;
			break;
		}
 
	}
	if(loopExists)
	{
		slowPtr=head;
 
		while(slowPtr!=fastPtr)
		{
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next;
		}
 
 
	}
	else
	{
		System.out.println("Loop does not exists");
		slowPtr=null;
	}
	return slowPtr;
}
