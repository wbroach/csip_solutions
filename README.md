# CSIP 09/04/2019

Please [Check in here](https://forms.gle/LV7y8YwFXX5Z6qDA8)

## 1301

1) Given an integer, sum all of the digits in the integer until you have a single digit integer
2) Transpose an M x N integer matrix. You may assume that the argument passed to the method is
   a valid matrix (i.e., the number of columns per row is consistent).

### Examples for Problem 1

n = 9497

9497 ---> 9 + 4 + 9 +7 = 29

29 ---> 2 + 9 = 11

11 ---> 1 + 1 = 2

return 2

## 1302 / 1730 / 2720

1) Given a linked list, return the nth to last node in the list, where n = 0 means that the
   last node is returned. You may assume that a valid value for n is passed (e.g., n will not
   equal 29 if the list is of size 7)


###Method Signature:
```java
public Node nthToLast(Node head, int n) { // .... (your code here)  }
```

2) Given a string representing a whitespace-delimited sentence (no punctuation, either), print 
   the sentence in decending order, then the first word, then in ascending

   - Prove the runtime (where n == the number of words) for bonus points!

###Method signature: 
```java
public void printDesc(String sentence) { ...  }
``` 

###Examples: 

```java
printDesc("I love Athens");
```
Should print:
```
I love Athens
I love
I
I love
I love Athens
```

```java
printDesc("Wear shoes when outdoors");
```
Should print:
```
Wear shoes when outdoors
Wear shoes when
Wear shoes
Wear
Wear shoes
Wear shoes when
Wear shoes when outdoors
```

## Post-2720

1) Reverse a singly-linked list recursively
2) Do the same thing, but iteratively

(Hint: doing #2 first may help you think about doing #1...what kind of data structure could help you here?)

## Graduation Time

1) Given a linked list with a `next`, `prev`, and `random` pointer in each node, return a deep copy of the list. 
   Note that the `random` pointer can point to any other node in the list, OR `null`

2) Given a node-based binary tree, return an equivalent array