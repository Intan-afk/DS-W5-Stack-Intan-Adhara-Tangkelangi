import java.util.Scanner;
import java.util.Stack;

public class NOMOR5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int n = scanner.nextInt();
        int value = 1;
        stack.push(value);

        while (value < n) {
            int next = value*2;
            value = stack.pop();
            if (next > n) {
                next = value;
                stack.push(next);
            }
            if (next == n) {
               break;
            }
            value = value - 1;
            stack.push(value);
        }
        for (int num : stack) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
