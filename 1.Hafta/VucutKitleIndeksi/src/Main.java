import java.util.Scanner;

public class Main   {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz 1,78 : ");
        double boy = scan.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz 77 : ");
        double kilo = scan.nextDouble();

        double indeks = kilo / (boy * boy);
        System.out.println("Beden Kitle İndeksiniz = " + indeks);


        if(indeks < 20) {
            System.out.println("Zayıf");
        }
        else if(indeks < 25) {
            System.out.println("Normal");
        }
        else if(indeks < 30) {
            System.out.println("Hafif şişman");
        }
        else if(indeks < 35) {
            System.out.println("Sisman");
        }
        else {
            System.out.println("Obez");
        }


    }
}