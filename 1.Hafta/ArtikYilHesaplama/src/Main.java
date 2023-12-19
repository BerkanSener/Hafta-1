 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Yılı Giriniz : ");
        int yil = inp.nextInt();

        if(yil % 400 == 0){
            System.out.println(yil + " Bir artık yıldır");
        }else if ((yil % 100 != 0) && (yil % 4 == 0)){
            System.out.println(yil + " Bir artık yıldır");
        }else {
            System.out.println(yil + "Bir artık yıl değildir");
        }

        }
    }
