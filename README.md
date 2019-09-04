# CSIP 09/04/2019

Welcome to Hash Map day. 

Please [Check in here](https://forms.gle/LV7y8YwFXX5Z6qDA8)


## Freshperson

1) Convert a string to an int.
2) Convert an int to a string. 

Notes: If you can, do not use Integer.parseInt(String int) or similar library functions

## Lowerclassperson

Given an array of integers and a value X, return an array of size two where the values
in that array are the indexes of the two integers that sum to X. If no two integers in
the array sum to X, return null

```java
public static int[] sumIdxs (int[] nums, int sum)
```


Example 1: 

```java
int[] test = { 1, 5, 44, 7, 4, 2, 0, 1069 }; 
int[] idx9 = sumIdxs(test, 9); // idx9 contains {1, 4}

```

Example 2: 

```java
int[] test2 = { 1, 2, 3, 5, 5, 5 };
int[] idxNull = sumIdxs(test2, 9); // idxNull == null

```

## Upperclassperson

Given a string (which will always be a whitespace-delimited sentence) as well as a string
consisting of characters, determine if the code matches the words in the string. If so,
return true. Otherwise, return false. 

```java
public boolean isValid(String sentence, String code)
```

Example 1:

```java
String sentence = "dog eat dog";
String code = "xyx"; 
// isValid(sentence, code) == true

String sentence2 = "dog eat dog eat dog";
String code2 = "xyxyy"
// isValid(sentence2, code2) == false

String sentence3 = "dog eat dog eat cat"
String code3 = "x y x z r"
// isValid(sentence3, code3) == false

```