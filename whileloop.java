
import java.util.*;

public class whileloop {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
        int i = 150;
        while (i <= number) {
            if(i%2==0)
            System.out.print(i + " ");
            i++;
    
        }
    }
    
}

    



// do whle loop

// import java.util.Scanner;

// public class whileloop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

// int number = sc.nextInt();
//         int i = 1;
//         do{
//             System.out.print(i + " ");
//             i++;
//         } 
//         while (i <= number);

//         sc.close();
//     }
   
// }