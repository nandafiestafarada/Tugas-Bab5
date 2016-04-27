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

