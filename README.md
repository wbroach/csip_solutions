# CSIP 10/16/2019

Please [Check in here](https://forms.gle/54S5SPdP98neAYsA76)

## Level 1

Many programming languages include a utiility method for strings called `strip()` or `trim()`. Implement this function, which should take in a string
and return the same string without and trailing or leading whitespace. If the string is composed entirely of whitespace, return the empty string. 


## Level 2

Given a value k, generate all well ordered numbers of length k. Well ordered means that the digits should be in increasing order.
You may assume that k will be an integer where 1 <= k <= 9 

Some examples: 

```java
Input : K = 7
Output :
1234567 1234568 1234569 1234578 1234579
1234589 1234678 1234679 1234689 1234789 
1235678 1235679 1235689 1235789 1236789 
1245678 1245679 1245689 1245789 1246789 
1256789 1345678 1345679 1345689 1345789 
1346789 1356789 1456789 2345678 2345679 
2345689 2345789 2346789 2356789 2456789 
3456789

Input  : K = 3
Output :
123 124 125 126 127 128 129 134 135 136 
137 138 139 145 146 147 148 149 156 157 
158 159 167 168 169 178 179 189 234 235 
236 237 238 239 245 246 247 248 249 256 
257 258 259 267 268 269 278 279 289 345 
346 347 348 349 356 357 358 359 367 368 
369 378 379 389 456 457 458 459 467 468 
469 478 479 489 567 568 569 578 579 589 
678 679 689 789

```

## Everybody

You are given the following database table: 

| EmployeeID | Employee Name | ManagerID |
| ----------- | ----------- | --------- |
| 77      | Title       | 6		|
| 46920   | Text        | 7		|
| ...	  | ...		| ...		|


Write a SQL statement that returns the employee ID, Employee Name, and manager name for each employee. 
Note that managers are employees, too. 

   
   
