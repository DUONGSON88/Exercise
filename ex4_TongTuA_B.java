package exercise.lv1;

import java.util.Scanner;

public class ex4_TongTuA_B {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Tính tổng các số từ A-B.");
        System.out.println("Enter A");
        int numberA=input.nextInt();
        System.out.println("Enter B");
        int numberB=input.nextInt();
        if (numberB>numberA){
            int result = numberA;
            System.out.println("Tổng các số từ "+ numberA +" đến" + numberB + " là:");
            for (int i = numberA; i <=numberB ; i++) {
             result+=i;
            }
            System.out.println(result-numberA);
        }else {
            System.out.println("Hãy nhập số A nhỏ hơn số B");
        }

    }
}
