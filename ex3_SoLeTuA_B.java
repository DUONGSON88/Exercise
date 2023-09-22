package exercise.lv1;

import java.util.Scanner;

public class ex3_SoLeTuA_B {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter A");
        int numberA=input.nextInt();
        System.out.println("Enter B");
        int numberB=input.nextInt();
        if (numberB>numberA){
            System.out.println("Số lẻ từ "+ numberA +" đến" + numberB + " là:");
            for (int i = numberA; i <=numberB ; i++) {
                if (i%2!=0){
                    System.out.println(i);
                }
            }
        }else {
            System.out.println("Hãy nhập số A nhỏ hơn số B");
        }

    }
}
