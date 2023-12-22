import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak Sayısını Giriniz: ");
        int basamakSayisi = scanner.nextInt();

        for (int i = 0; i < basamakSayisi; i++) {
            // Boşlukları yazdır
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Yıldızları yazdır
            for (int k = 0; k < 2 * (basamakSayisi - i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
