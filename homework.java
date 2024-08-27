
package btap;

import java.util.Random;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int diem = 0;
        int Solansai = 0;
        while (Solansai < 3) {
            int SoluongSohang = rand.nextInt(4) + 2;
            int[] Songaunhien = new int[SoluongSohang];
            int Tongdung = 0;
            System.out.println("Tong cua ");
            for (int i = 0; i < SoluongSohang; i++) {
                Songaunhien[i] = rand.nextInt(10) + 1;
                Tongdung += Songaunhien[i];
                System.out.print(Songaunhien[i]);
                if (i < SoluongSohang - 1) {
                    System.out.print("+");
                }
            }
            System.out.println("La bao nhieu ?");
            int Dapan = scanner.nextInt();
            if (Dapan == Tongdung) {
                System.out.println("Chinh xac");
                diem++;
            } else {
                System.out.println("Sai! Dap an dung la " + Tongdung);
                Solansai++;
            }
            System.out.println("Diem hien tai: " + diem);
            System.out.println("So lan tra loi sai: " + Solansai);
        }
        System.out.println("Ket thuc. Duoc " + diem + " diem ");
    }
}
    
    


