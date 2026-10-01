package latihan;

import java.util.Scanner;

public class LatihanBidangDatar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input user
        System.out.print("Masukkan panjang persegi panjang : ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar persegi panjang   : ");
        double lebar = input.nextDouble();

        // Menghitung luas
        double luas = panjang * lebar;

        // Menghitung keliling
        double keliling = 2 * (panjang + lebar);

        // Output
        System.out.println("\n=== PERSEGI PANJANG ===");
        System.out.println("Panjang  : " + panjang);
        System.out.println("Lebar    : " + lebar);
        System.out.println("Luas     : " + luas);
        System.out.println("Keliling : " + keliling);

        input.close();
    }
}

