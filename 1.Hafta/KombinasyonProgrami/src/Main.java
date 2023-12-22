import java.util.Scanner;

public class Main {

    // Faktöriyel hesaplama metodu
    public static long faktoriyel(int sayi) {
        if (sayi == 0 || sayi == 1) {
            return 1;
        } else {
            return sayi * faktoriyel(sayi - 1);
        }
    }

    // Kombinasyon hesaplama metodu
    public static long kombinasyon(int n, int r) {
        if (n < r) {
            return 0; // Geçersiz durum: n, r'den küçük olmalı
        } else {
            return faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = scanner.nextInt();

        System.out.print("r değerini giriniz: ");
        int r = scanner.nextInt();

        // Kombinasyon hesapla ve ekrana yazdır
        long kombinasyonSonucu = kombinasyon(n, r);
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyonSonucu);
    }
}
