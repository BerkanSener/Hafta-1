import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplam = 0;
        int n;

        do {
            System.out.print("Bir sayı giriniz : ");
            n = scanner.nextInt();

            // Girilen sayı çift ve 4'ün katı ise toplama ekle
            if (n % 2 == 0 && n % 4 == 0) {
                toplam += n;
            }

        } while (n % 2==0);

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);
    }
}