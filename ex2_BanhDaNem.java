package exercise.lv1;

import java.util.Scanner;

public class ex2_BanhDaNem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số bánh cần làm: ");
        int numberProduct=input.nextInt();
        System.out.println("Nhập số bánh có thể làm trong 1 ngày: ");
        int numberProductinDay=input.nextInt();

        double time=numberProduct/numberProductinDay;
        System.out.println("Số thời gian để làm ra "+numberProduct+ " cần "+ time+ " ngày!" );

    }
}
