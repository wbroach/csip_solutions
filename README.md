# CSIP 10/09/2019

Please [Check in here](https://forms.gle/CxLJKP7Mre3h7HJY6)

## 1301 / 1302 / Taking Data Structures

1) Find the middle value in a linked list. Do it in actual O(1*n) time. 
2) Given a linked list that either terminates with null, or where the last node in the list points
   back to some other node in the list (not necessarily the first!), write a function that returns false in the first case and true in the second case.

   BONUS: Do it in O(n) time, O(1) space

## Has Taken Data Structures

1) A Seed of a number n is a number x such that multiplication of x with its digits is equal to n. The task is to find all seeds of a given number n. 
   If no seed exists, then print the same.

   Examples:
   ```
   Input  : n = 138
   Output : 23 
   23 is a seed of 138 because
   23 * 2 * 3 is equal to 138

   Input : n = 4977
   Output : 79 711 
   79 is a seed of 4977 because
   79 * 7 * 9 = 4977.

   711 is also a seed of 4977 because
   711 * 1 * 1 * 7 = 4977

   Input  : n = 9
   Output : No seed exists

   Input  : n = 738
   Output : 123 
   ```

2) Given a 2D grid of characters and a word, find all occurrences of given word in grid. A word can be matched in all 8 directions at any point. Word is said be found 
   in a direction if all characters match in this direction (not in zig-zag form).

   The 8 directions are, Horizontally Left, Horizontally Right, Vertically Up and 4 Diagonal directions.


## Everybody

1) Give the best-fit Big-O runtime for this function: 


```java
public void whatever(double n) {

       if (n < 0) { n *= -1; }

       if (n <= 3> {
       	  System.out.println("whatever");
       }
       else {
       	  return whatever(Math.sqrt(n));
       }

}

```

2) Given a full triary tree with 4 internal nodes, calculate the number of leaf nodes present

   HINT: More generally, given a full N-ary tree with I internal nodes, calculate the number of leaf nodes L
   DOUBLE HINT: What do the edges between two nodes tell you? Could you somehow count those to arrive at the answer?
   
   
