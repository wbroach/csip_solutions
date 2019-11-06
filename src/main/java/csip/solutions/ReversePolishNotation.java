import java.util.Stack;

// you may assume that the expression is correctly formed, consisting of integers
// and operators only. 
// You may assume only "+" and "*" operators: others would require only additional
// boolean statements in the isOperator method
public class ReversePolishNotation {
    
    public static String postfixToInfix(String exp) {    
        Stack<String> stk = new Stack<>();
        
        for (int i = 0; i < exp.length(); ++i) {
            char cur = exp.charAt(i);
            
            if (isOperator(cur)) {
                String rhs = stk.pop();
                String lhs = stk.pop();
                
                String newStr = "(" + lhs + cur + rhs + ")";
                stk.push(newStr);
            }
            else {
                stk.push(cur + "");
            }
            
        }
        
        return stk.pop();
    }
    
    private static boolean isOperator(char c) {
        return c == '+' || c == '*';
    }
    
    public static void main(String[] args) {
        String test1 = "AB+"; // should equal (A + B)
        String test2 = "AB+C*"; // should equal ((A + B) * C)
        String test3 = "AB+CD+*"; // should equal ((A+B)*(C+D))
        
        System.out.println("test1 == " + postfixToInfix(test1));
        System.out.println("test2 == " + postfixToInfix(test2));
        System.out.println("test3 == " + postfixToInfix(test3));
    }
}