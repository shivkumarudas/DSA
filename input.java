import java.util.Scanner;
public class input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int a=sc.nextInt();
        System.out.println("Enter second value");
        int b=sc.nextInt();
        int sum= a+b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        System.out.println("Enter value");
    }
}
