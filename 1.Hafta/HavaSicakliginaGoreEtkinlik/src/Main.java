import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        int head;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz :");
        head = input.nextInt();

        if (head < 5) {
            System.out.print("Kayak Yapmaya Gidebilirsiniz");
        } else if (head < 15) {
            System.out.print("Sinemaya Gidebilirsiniz");
        } else if (head < 25) {
            System.out.print("Piknik Yapmaya Gidebilirsiniz");
        } else {
            System.out.print
                    ("Yüzmeye Gİdebilirsiniz");


        }
    }
}


