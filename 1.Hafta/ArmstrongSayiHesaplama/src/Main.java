import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();
        int basNumber;
        int tempNumber;
        int result = 0;
        int basPow;

        tempNumber = number;
        basNumber = 0;
        int basValue ;
        while (tempNumber!=0){
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber!=0){
            basValue = tempNumber%10;
            basPow=1;
            for (int i=1; i<=basNumber; i++) {

                basPow *= basValue;


            }
            result += basPow; //
            tempNumber /= 10;
        }
        if (result == number){
            System.out.println(number + " sayısı bir Armstrong sayıdır.");

        } else {
            System.out.println(number + " sayısı bir Armstrong sayı değildir.");

        }
    }
}