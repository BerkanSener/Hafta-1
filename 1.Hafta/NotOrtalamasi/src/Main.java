import java.util.Scanner;
public  class Main {
    public  static void main(String[] args) {
        // Değişkenleri oluştur
        double mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        // KUllanıcıdan değerleri al
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextDouble();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextDouble();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextDouble();

        System.out.print("Turkce Notunuz : ");
        turkce = inp.nextDouble();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextDouble();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextDouble();


        double ortalama = ((mat + fizik + kimya + turkce + tarih + muzik) / 6);
        System.out.println(ortalama);
        System.out.println(ortalama > 60 ? "Dersi Geçti" : "Dersten Kaldı");



    }


}
