import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        System.out.print("Armut kaç kilo : ");
        int armut_kg = scanner.nextInt();
        System.out.print("Elma kaç kilo : ");
        int elma_kg = scanner.nextInt();
        System.out.print("Domates kaç kilo : ");
        int domates_kg = scanner.nextInt();
        System.out.print("Muz kaç kilo : ");
        int muz_kg = scanner.nextInt();
        System.out.print("Patlıcan kaç kilo : ");
        int patlican_kg = scanner.nextInt();

        double toplam_tutar = (armut_kg * armut) + (elma_kg * elma) + (domates_kg * domates) + (muz_kg * muz) + (patlican_kg * patlican);

        System.out.println(toplam_tutar + "TL");

    }

}