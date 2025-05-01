import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter key for operation (+, -, *, /): ");
        char key = sc.next().charAt(0);
        switch (key) {
            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Division: " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation key.");
        }
        
        sc.close();
    }
    
}
