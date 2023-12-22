import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        int ebob = hesaplaEBOB(sayi1, sayi2);
        int ekok = hesaplaEKOK(sayi1, sayi2);

        System.out.println("EBOB(" + sayi1 + ", " + sayi2 + ") = " + ebob);
        System.out.println("EKOK(" + sayi1 + ", " + sayi2 + ") = " + ekok);
    }

    // EBOB hesaplama metodu
    private static int hesaplaEBOB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // EKOK hesaplama metodu
    private static int hesaplaEKOK(int a, int b) {
        return (a * b) / hesaplaEBOB(a, b);
    }
}
