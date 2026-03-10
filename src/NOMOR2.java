import java.util.Stack;
public class NOMOR2 {
    public static int evaluateRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;
                switch (token) {
                    case "+" -> result = a + b;
                    case "-" -> result = a - b;
                    case "*" -> result = a * b;
                    case "/" -> result = a / b;
                }
                stack.push(result);
            } else {
                int number = Integer.parseInt(token);
                stack.push(number);
            }
        }
        int finalResult = stack.pop();
        finalResult = finalResult+13;
        return finalResult;
    }
    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = evaluateRPN(tokens);
        System.out.println("Final Result: " + result);
    }
}
