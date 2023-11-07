public class PostFixCalculator {
    private String[] parts;

    private Stack<Integer> stack = new Stack<Integer>();

    public PostFixCalculator() {
    }

    public int calculate(String input) {

        parts = input.split(" ");

        for (String section : parts) {
            switch (section) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(stack.pop() - stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    stack.push(stack.pop() / stack.pop());
                    break;
                default:
                    stack.push(Integer.parseInt(section));
                    break;
            }
        }

        return stack.peek();
    }

}
