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
    
    private void Sederhana(int bil1, int bil2) {
        System.out.println("*******Dalam Bentuk Pecahan*******");
        System.out.println("hasil dari pecahan = " + bil1 + "/" + bil2);
        int a = bil1;
        while (true) {
            if (bil1 % 2 == 0 && bil2 % 2 == 0) {
                bil1 = bil1 / 2;
                bil2 = bil2 / 2;
            } else if (bil1 % 3 == 0 && bil2 % 3 == 0) {
                bil1 = bil1 / 3;
                bil2 = bil2 / 3;
            } else {
                break;
            }
            if (bil1 != a) {
                System.out.println("Disederhanakan menjadi = " + bil1 + "/" + bil2);
            } else {
                System.out.println("Disederhanakan menjadi = " + bil1 + "/" + bil2 + "(tidak dapat disederhankan)");
            }
        }
    }
}
