package exercise.lv1;

import java.util.Scanner;

public class ex5_TinhTongGiaiThua_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tính Tổng Giai Thừa Của Số N");
        System.out.println("Enter N:");
        int N = input.nextInt();
        System.out.println("Tổng Giai Thừa Của Số N la :");
        int result = 0;
        for (int i = 0; i <= N; i++) {
            result += i*(i + 1);
        }
        System.out.println(result);
    }
}




