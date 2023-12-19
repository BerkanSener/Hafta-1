import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     double tutar,vergi,toplam;
     Scanner giriş = new Scanner(System.in);

        System.out.print("Ürün Turarı Giriniz: ");
        tutar = giriş.nextShort();

        if (tutar <1000) {
            toplam = tutar * 1.18;
            vergi = toplam - tutar;
            System.out.print("KDV'siz fiyat: " + tutar + "\n" + "KDV oranı: %18" + "\n" + "KDV dahil fiyatı: " + toplam + "\n" + "KDV tutarı: " + vergi);
        }
        else {
            toplam = tutar * 1.08;
            vergi = toplam - tutar;
            System.out.print("KDV'siz fiyat: " + tutar + "\n" + "KDV ornı : %8" + "\n" + "KDV dahil fiyat: " + toplam + "\n" + "KDV tutarı: " +vergi);



        }
    }
}