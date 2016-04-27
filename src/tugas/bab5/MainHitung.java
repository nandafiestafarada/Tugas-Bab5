package Hitung;

import java.util.Scanner;

public class MainHitung {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hitung h1 = new Hitung();
        int bil1, bil2;
        int pilihan;
                
        do {
            System.out.println("**** MENU ****");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.println("**************");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = in.nextInt();
            System.out.println("_________________________");
            switch (pilihan) {
                case 1:
                    System.out.println("****Penjumlahan****");
                    System.out.print("Masukkan bilangan 1 = ");
                    bil1 = in.nextInt();
                    System.out.print("Masukkan bilangan 2 = ");
                    bil2 = in.nextInt();
                    Hitung.Penjumlahan(bil1, bil2);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("****Pengurangan****");
                    System.out.print("Masukkan bilangan 1 = ");
                    bil1 = in.nextInt();
                    System.out.print("Masukkan bilangan 2 = ");
                    bil2 = in.nextInt();
                    Hitung.Pengurangan(bil1, bil2);
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("****Perkalian****");
                    System.out.print("Masukkan bilangan 1 = ");
                    bil1 = in.nextInt();
                    System.out.print("Masukkan bilangan 2 = ");
                    bil2 = in.nextInt();
                    h1.Perkalian(bil1, bil2);
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("****Pembagian****");
                    System.out.print("Masukkan bilangan 1 = ");
                    bil1 = in.nextInt();
                    System.out.print("Masukkan bilangan 2 = ");
                    bil2 = in.nextInt();
                    h1.Pembagian(bil1, bil2);
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println("KELUAR!!!");
                default:
                    System.out.println("INPUTAN ANDA TIDAK TERSEDIA");
            }
        } while (pilihan >= 1 && pilihan < 5);
    }
}
