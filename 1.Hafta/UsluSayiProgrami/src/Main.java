import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tabanı giriniz: ");
        int taban = scanner.nextInt();

        System.out.print("Üssü giriniz: ");
        int us = scanner.nextInt();

        // Sonuç için bir değişken oluştur
        int sonuc = 1;

        // Üslü sayıyı hesaplamak için for döngüsü kullan
        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }

        // Sonucu ekrana yazdır
        System.out.println(taban + "^" + us + " = " + sonuc);
    }
}
