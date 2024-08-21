package JAVA_practise;
import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        int num = sc.nextInt();

        sc.close();

        switch (num % 2) 
        {
            case 0:
                System.out.println("It is an even number");
                break;
            case 1:
                System.out.println("It is an odd number");
                break;
            default:
             System.out.println("Invalid input");
                break;
        }
    }
}
