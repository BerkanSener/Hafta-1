import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz : ");
        userName = input.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        password = input.nextLine();

        if(userName.equals("Patika") && password.equals("Java123")) {
            System.out.println("Giriş Başarılı : ");
        }
        else{
            System.out.print("Kullanıcı Adı veya Şifreniz Yanlış : ");
            System.out.println("Şifreniz Hatalı.Şifrenizi Sıfırlamak İster misiniz? \n1-Evet \n2-Hayır");
            String cevap = input.nextLine();

            if(cevap.equals("Evet")) {
                System.out.print("Yeni Şifrenizi Giriniz : ");
                String newPassword = input.nextLine();

                if(newPassword.equals("Java123")) {
                    System.out.println("Şifre oluşturulamadı , lütfen başka bir şifre giriniz : ");
                }
                else {
                    System.out.println("Şifre Oluşturuldu");

                }
            }
        }
    }

}