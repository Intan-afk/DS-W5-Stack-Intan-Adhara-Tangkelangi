import java.util.Stack;
public class NOMOR1 {
 public static void main(String[] args) {
        String test = "({[]})";
        if (isBalanced(test)) {
            System.out.println("Balanced.");
        } else {
            System.out.println("Not Balanced.");
        }
        
    }
     public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>(); //LIFO
        
        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') { 
                stack.push(c);//menambahkan
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop(); //mangambil dan menghapus elemen teratas
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                    
                }
            }
        }
        
        if (stack.isEmpty()) {
            System.out.println("Valid expression");
        } else {
            System.out.println("Invalid expression");
        }
        return stack.isEmpty();
    }
}