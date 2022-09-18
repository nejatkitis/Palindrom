import java.util.Scanner;

public class Palindrom {

    static boolean palindrom(int number){
        int temp =number,num=0,last;
        while (temp!=0){
            last = temp % 10;
            num = (num*10)+last;
            temp /=10;
        }
        if (num==number) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();
        System.out.print(number);
        if (palindrom(number)){
            System.out.println(" : Bir palindrom sayıdır.");
        } else {
            System.out.println(" : Bir palindrom sayı değildir.");
        }
    }
}
