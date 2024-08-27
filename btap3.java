
package btap;

import java.util.Scanner;

public class btap3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        int number = 1;
        while (number !=0) {
            System.out.println("Enter a number (0 to quit): ");
            number = console.nextInt();
            sum = sum + number;
        }
        System.out.println("The total is " + sum);
    }
    
}
