import java.util.Scanner;
public class Circle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius value");
        int r=sc.nextInt();
        float Area=3.14f*r*r;
        System.out.println("The Area of Circle is: " + Area);
    }
}

