import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, yas, tip;
        double mesafeUcreti, indirimTutari, toplamTutar;

        Scanner scanner = new Scanner(System.in);

        // Mesafe bilgisini al
        System.out.print("Mesafeyi km türünden giriniz: ");
        km = scanner.nextInt();

        // Mesafe negatifse hata mesajı ver ve programı sonlandır
        if (km < 0) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        // Mesafe başına ücreti hesapla
        mesafeUcreti = km * 0.10;

        // Yaş bilgisini al
        System.out.print("Yasinizi giriniz: ");
        yas = scanner.nextInt();

        // Yaş negatifse hata mesajı ver ve programı sonlandır
        if (yas < 0) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        // Yaşa göre indirim uygula
        if (yas < 12) {
            indirimTutari = mesafeUcreti * 0.5;
        } else if (yas >= 12 && yas <= 24) {
            indirimTutari = mesafeUcreti * 0.1;
        } else if (yas >= 65) {
            indirimTutari = mesafeUcreti * 0.3;
        } else {
            indirimTutari = 0; // İndirim uygulanmaz
        }

        // Yolculuk tipini al
        System.out.print("Yolculuk tipinizi giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        tip = scanner.nextInt();

        // Yolculuk tipi 1 veya 2 değilse hata mesajı ver ve programı sonlandır
        if (!(tip == 1 || tip == 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        // Yolculuk tipine göre indirim uygula
        if (tip == 2) {
            indirimTutari += mesafeUcreti * 0.2;
            toplamTutar = 2 * (mesafeUcreti - indirimTutari);
        } else {
            toplamTutar = mesafeUcreti - indirimTutari;
        }

        // Toplam tutarı ekrana yazdır
        System.out.println("Toplam Tutar = " + toplamTutar + " TL");
    }
}