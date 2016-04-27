package Jaket;

public class Jaket {

    private final int jaketA = 100000;
    private final int jaketB = 125000;
    private final int jaketC = 175000;
    private static int jumlah = 0;
    private static int A, B, C = 0;
    
    public Jaket(int banyak, int pilihan) {
        if (pilihan == 1) {
            A = banyak + A;
        } else if (pilihan == 2) {
            B = banyak + B;
        } else {
            C = banyak + C;
        }
    }
    
    public void JaketA() {
        int hasil = 0;
        if (A <= 100) {
            hasil = A * jaketA;
        } else {
            hasil = A * (jaketA - 5000);
        }
        jumlah = jumlah + hasil;
        System.out.println("Harga yang dibayar : Rp." + hasil);
    }
    
    public void JaketB() {
        int hasil = 0;
        if (B <= 100) {
            hasil = B * jaketB;
        } else {
            hasil = B * (jaketB - 5000);
        }
        jumlah = jumlah + hasil;
        System.out.println("Harga yang dibayar : Rp." + hasil);
    }
    
    public void JaketC() {
        int hasil = 0;
        if (C <= 100) {
            hasil = C * jaketC;
        } else {
            hasil = C * (jaketC - 15000);
        }
        jumlah = jumlah + hasil;
        System.out.println("Harga yang dibayar : Rp." + hasil);
    }

    public static int getJumlah() {
        return jumlah;
    }
}

