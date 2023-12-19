import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat,fizik,turkce,kimya,müzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz : ");
        müzik = input.nextInt();

        double avarage = (mat + fizik + turkce + kimya +müzik) / 5;

           if   ((mat >= 0 && mat <= 100) && (turkce >= 0 && turkce <= 100) &&
                (fizik >= 0 && fizik <= 100) && (kimya >= 0 && kimya <= 100)&&
                (müzik >= 0 && müzik <= 100)){

               if (avarage < 55) {
                   System.out.println("Sınıfta Kaldınız !");
               }
           else {
                   System.out.println("Sınıfı Geçtiniz!");
               }
           }
               else {
        System.out.print("Geçersiz Not Girdiniz.Hesaplanamıyor!");
    }
    }
    }
