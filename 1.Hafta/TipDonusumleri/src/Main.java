import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kullanıcıdan tam sayı ve ondalıklı sayı almak için Scanner kullanımı
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz: ");
        int integerNumber = scanner.nextInt();

        System.out.print("Bir ondalıklı sayı giriniz: ");
        double doubleNumber = scanner.nextDouble();

        // Tam sayıyı ondalıklı sayıya dönüştürme
        double convertedDouble = (double) integerNumber;

        // Ondalıklı sayıyı tam sayıya dönüştürme
        int convertedInteger = (int) doubleNumber;

        // Sonuçları ekrana yazdırma
        System.out.println("Girilen tam sayı: " + integerNumber);
        System.out.println("Girilen ondalıklı sayı: " + doubleNumber);
        System.out.println("Tam sayıyı ondalıklı sayıya dönüştürüldü: " + convertedDouble);
        System.out.println("Ondalıklı sayıyı tam sayıya dönüştürüldü: " + convertedInteger);

        // Scanner'ı kapatma
        scanner.close();
    }
}
