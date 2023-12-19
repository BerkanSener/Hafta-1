import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner deger = new Scanner(System.in);


        System.out.print("Bir değer girin : ");
        int a = deger.nextInt();


        System.out.print("Bir değer girin : ");
        int b = deger.nextInt();


        System.out.print("Bir değer girin : ");
        int c = deger.nextInt();


        int sonuc =  a+b*c-b;
        System.out.println("sonuc: " + sonuc);

    }
}