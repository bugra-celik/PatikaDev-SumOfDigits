
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      int number;
      int basValue;
      int result =0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        number = inp.nextInt();

        while(number != 0){
            basValue = number % 10;
            result += basValue;
            number /= 10;

        }
        System.out.println("Sayının basamakları toplamı:" + result);


    }
}
