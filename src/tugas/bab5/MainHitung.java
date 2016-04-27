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
        
