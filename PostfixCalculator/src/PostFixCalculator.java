/**
 * Postfix-Calculator.java
 * Authors: Luke O’Drobinak, Hugh Karmozyn
 * Date: 11/7/2023
 * Collaborators:
 * Citations: Google, Stack Overflow
 **/
public class PostFixCalculator {

    // Instance variables
    private String[] parts;
    private Stack<Double> stack = new Stack<Double>();

    // Constructor
    public PostFixCalculator() {
    }

    // Calculate the result of the postfix expression
    public double calculate(String input) {
        double  temp1;
        double  temp2;

        // Split the input string into parts
        parts = input.split(" ");

        // Iterate through the parts and perform the proper stack operations
        for (String section : parts) {
            switch (section) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    temp1 = stack.pop();
                    temp2 = stack.pop();
                    stack.push((temp2 - temp1));
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    temp1 = stack.pop();
                    temp2 = stack.pop();
                    stack.push((temp2 / temp1));
                    break;
                case "%":
                    temp1 = stack.pop();
                    temp2 = stack.pop();
                    stack.push((temp2 % temp1));
                    break;
                default:
                    stack.push(Double.parseDouble(section));
                    break;
            }
        }

        // Return the result
        return stack.peek();
    }

}
