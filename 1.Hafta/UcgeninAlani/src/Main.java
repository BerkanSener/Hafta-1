import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner deger = new Scanner(System.in);
        System.out.print("Üçgenin 1. kenar uzunluğunu girin: ");
        double kenar1 = deger.nextDouble();

        System.out.print("Üçgenin 2. kenar uzunluğunu girin: ");
        double kenar2 = deger.nextDouble();

        System.out.print("Üçgenin 3. kenar uzunluğunu girin: ");
        double kenar3 = deger.nextDouble();


        double u = (kenar1 + kenar2 + kenar3) / 2;
        double alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));


        System.out.println("Üçgenin alanı: " + alan);


        deger.close();

    }
}