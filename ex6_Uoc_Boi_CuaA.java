package exercise.lv1;

import java.util.Scanner;

public class ex6_Uoc_Boi_CuaA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tìm các ước và bội nhỏ hơn 100 của số nguyên dương a");
        System.out.println("Nhập số a:");
        int a = input.nextInt();
        System.out.println("Ước của só " + a + " là :");
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Bội của só " + a + " nhỏ hơn 100 là :");
        for (int i = 1; a * i < 100; i++) {
            if (i % a == 0) {
                System.out.println(i);
            }
        }
    }
}
