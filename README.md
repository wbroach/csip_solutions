# CSIP 11/13/2019

Please [Check in here](https://docs.google.com/forms/d/e/1FAIpQLScmmgOxU1sxZPqFstweD_qU8C_eu0MtK6wn3BajnftPz6j7_A/viewform?usp=sf_link)



## Conceptual Problems

   Today will focus on a single problem, and several people will be selected to perform a 'mock' interview. This will be used to demonstrate how to talk during a coding interview, and what to do when you're stuck, or what to do if the question is easy to you.

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




### Reverse Polish Notation

Postfix notation, also known as reverse Polish notation, is a syntax for mathematical
expressions in which the mathematical operator is always placed after the operands.

Infix notation is the kind of mathematical notation that we are used to. In infix 
notation, the mathematical operation is placed in between the operaands. 

Convert a string representing a mathematical expression in postfix notation into a 
string representing the identical expression in infix notation.

You may assume that the expression is correctly formed, and that it consists of String / char (however you want to think of it)
representations of integers and operators only. In addition, you may assume that only 
the "+" and "*" operators are supported (note that, in an ideal solution, other 
operators would be trivial to add, requiring only additional boolean evaluation).

Some examples follow:

```
Input : ab+
Output : (a+b)

Input : abc++
Output : (a+(b+c))

Input  : ab*c+
Output : ((a*b)+c)

Input : ab+cd+*
Output : ((a+b)*(c+d))
```


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

static boolean isOperand(char x)
    {
        return (x >= 'a' && x <= 'z') ||
                (x >= 'A' && x <= 'Z');
    }

    // Get Infix for a given postfix
// expression
    static String getInfix(String exp)
    {
        Stack<String> s = new Stack<String>();

        for (int i = 0; i < exp.length(); i++)
        {
            // Push operands
            if (isOperand(exp.charAt(i)))
            {
                s.push(exp.charAt(i) + "");
            }

            // We assume that input is
            // a valid postfix and expect
            // an operator.
            else
            {
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();
                s.push("(" + op2 + exp.charAt(i) +
                        op1 + ")");
            }
        }

        // There must be a single element
        // in stack now which is the required
        // infix.
        return s.peek();
    }
