import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter Your Math Equation in Reverse Polish notation");
        String userInput = s.nextLine();


        Stack forward = new Stack<>();
        Stack backwards = new Stack<>();

        for(int i=0; i<userInput.length(); i++){
            forward.push(userInput.charAt(i));
        }

        for(int i=0; i< userInput.length();i++){
            backwards.push(forward.pop());
        }
        System.out.println(backwards.peek());

    }
}