import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int girilenSayi = scanner.nextInt();

        // Toplamı ve adeti saklamak için değişkenler
        int toplam = 0;
        int adet = 0;

        // 0'dan girilen sayıya kadar olan sayıları kontrol et
        for (int i = 0; i <= girilenSayi; i++) {
            // 3'e ve 4'e tam bölünen sayıları bul
            if (i % 3 == 0 && i % 4 == 0) {
                // Toplamı güncelle
                toplam += i;
                // Adeti arttır
                adet++;
            }
        }

        // Adet 0 ise ortalamayı 0 olarak kabul et, aksi takdirde ortalamayı hesapla
        double ortalama = (adet == 0) ? 0 : (double) toplam / adet;

        System.out.println("0'dan " + girilenSayi + "'e kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
    }
}
