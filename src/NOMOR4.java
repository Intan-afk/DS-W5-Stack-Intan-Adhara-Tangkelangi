
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
public class NOMOR4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();
        Random rand = new Random();

        System.out.println("Kasmir Tampan");
        System.out.print("Masukkan jumlah angka yang diinginkan: ");
        int n = scanner.nextInt();  

        System.out.print("Angka yang dimasukkan: ");
        for (int i = 0; i < n; i++) {
            int number = rand.nextInt(100) + 1; 
            System.out.print(number + " ");
            stack.push(number);
        }

        System.out.println("\nKasmir Ganteng Banget");
        
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                System.out.print(tempStack.pop() + " ");
            }
            tempStack.push(temp);
        }

        System.out.println("\nHasil: ");
        while (!tempStack.isEmpty()) {
            System.out.print(tempStack.remove(0) + " ");
        }
    }
}