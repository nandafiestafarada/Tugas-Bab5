package Hitung;

public class Hitung {

    public static void Penjumlahan(int bil1, int bil2) {
        int nilai = bil1 + bil2;
        System.out.println("Hasil penjumlahan  = " + nilai);
    }
    
    public static void Pengurangan(int bil1, int bil2) {
        int nilai = bil1 - bil2;
        System.out.println("Hasil pengurangan  = " + nilai);
    }
    
    public void Perkalian(int bil1, int bil2) {
        int nilai = bil1 * bil2;
        System.out.println("Hasil perkalian    = " + nilai);
    }

    public void Pembagian(int bil1, int bil2) {
        double a = bil1;
        double b = bil2;
        double nilai = a / b;
        System.out.println("Hasil pembagian    = " + nilai);
        Sederhana(bil1, bil2);
    }
