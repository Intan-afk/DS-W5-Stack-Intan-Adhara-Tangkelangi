
import java.util.Scanner;
import java.util.Stack;

public class NOMOR3 {
    public static String buildInstructions(int[]target) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder instructions = new StringBuilder();
        for (int num : target) {
            stack.push(1);
            instructions.append("1");
            while (stack.peek() < num) {
                int top = stack.pop();
                stack.push(top + 13);
                instructions.append("d");
            }
            if (stack.size() >= 2) {
                int a = stack.pop();
                int b = stack.pop();
                int merged = a + b;
                stack.push(merged);
                instructions.append("+");
            }
        }
        return instructions.toString();
    }
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("BANANA: ");
        int n = scanner.nextInt();
        int[] target = new int[n];
        for (int i = 0; i < n; i++) {
            target[i] = scanner.nextInt();
        }
        String result = buildInstructions(target);
        System.out.println("Instructions: " + result);

    }
}
