import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi <= 0) {
            System.out.println("Lütfen pozitif bir sayı giriniz.");
        } else {
            boolean sonuc = isMukemmelSayi(sayi);

            if (sonuc) {
                System.out.println(sayi + " Mükemmel sayıdır.");
            } else {
                System.out.println(sayi + " Mükemmel sayı değildir.");
            }
        }
    }

    // Bir sayının mükemmel sayı olup olmadığını kontrol eden metod
    private static boolean isMukemmelSayi(int sayi) {
        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        return toplam == sayi;
    }
}
