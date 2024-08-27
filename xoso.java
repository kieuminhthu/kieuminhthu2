
package btap;

import java.util.Random;
import java.util.Scanner;

public class xoso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int Sotrungthuong = rand.nextInt(100) + 1;
        System.out.println("Chuong trinh xo so");
        System.out.println("Nhap tu 1 den 100 de du doan ket qua");
        int Dudoan = scanner.nextInt();
        if (Dudoan == Sotrungthuong) {
            System.out.println("Ban da trung so voi so " + Sotrungthuong);
        } else {
            System.out.println("Sai. So trung la " + Sotrungthuong);
        }
    }
}
