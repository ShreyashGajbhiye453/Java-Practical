package calculator;
import java.util.Stack;

/**
 *
 * @author Shreyash
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    
    private int result;

    
    public Calculator(String expression) {
        this.result = evaluate(expression);
    }

    
    public int getResult() {
        return result;
    }

    
    private int evaluate(String s) {
   
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        
        char lastOperator = '+';

        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            
            if (Character.isDigit(currentChar)) {
                currentNumber = currentNumber * 10 + (currentChar - '0');
            }
            
            
            if ((!Character.isDigit(currentChar) && currentChar != ' ') || i == s.length() - 1) {
                switch (lastOperator) {
                    case '+':
                        stack.push(currentNumber);
                        break;
                    case '-':
                        stack.push(-currentNumber);
                        break;
                    case '*':
                        stack.push(stack.pop() * currentNumber);
                        break;
                    case '/':
                        stack.push(stack.pop() / currentNumber);
                        break;
                }
              
                lastOperator = currentChar;
                currentNumber = 0;
            }
        }
        
       
        int total = 0;
        while (!stack.isEmpty()) {
            total += stack.pop();
        }
        return total;
    }
  
}
