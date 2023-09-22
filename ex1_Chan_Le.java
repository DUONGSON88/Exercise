package exercise.lv1;

import java.util.Scanner;

public class ex1_Chan_Le {
    public static void main(String[] args) {
        Scanner inputInt=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number=inputInt.nextInt();
        if (number%2==0){
            System.out.println(number + " is So Chan.");
        }else {
            System.out.println(number + " is So Le.");
        }
    }


}
