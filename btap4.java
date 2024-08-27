
package btap;

import java.util.Scanner;

public class btap4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String phrase;
        do {
            System.out.println("type your password: ");
            phrase = console.next();
        } while (!phrase.equals("duytan"));
    }
    
}
