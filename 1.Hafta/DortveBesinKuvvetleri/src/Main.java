import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayı = scanner.nextInt();

        System.out.println(sayı + " sayısına kadar olan 4 ve 5'in kuvvetleri:");

        // 4'ün kuvvetlerini yazdır
        System.out.println("4'ün kuvvetleri:");
        for (int i = 0; Math.pow(4, i) <= sayı; i++) {
            System.out.print((int) Math.pow(4, i) + " ");
        }

        System.out.println();

        // 5'in kuvvetlerini yazdır
        System.out.println("5'in kuvvetleri:");
        for (int i = 0; Math.pow(5, i) <= sayı; i++) {
            System.out.print((int) Math.pow(5, i) + " ");
        }
    }
}