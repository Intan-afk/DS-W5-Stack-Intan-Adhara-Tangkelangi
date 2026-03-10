
import java.util.Scanner;
import java.util.Stack;

public class NOMOR4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();

        System.out.print("Kasmir Tampan");
        System.out.println(" ");
        System.out.print("Masukkan angka: ");
        
        String input = scanner.nextLine();
        String[] tokens = input.split(" "); 

        for (String token : tokens) {
            int number = Integer.parseInt(token);
            stack.push(number);
        }
        System.out.print("Kasmir Ganteng Banget");
        System.out.println(" ");

        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                System.out.print(tempStack.pop() + " ");
            }
            tempStack.push(temp);
        }
        System.out.println(" ");
        System.out.print("Hasil: ");
        while (!tempStack.isEmpty()) {
            System.out.print(tempStack.remove(0) + " ");
        }
    } 
}
