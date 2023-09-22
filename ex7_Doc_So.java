package exercise.lv1;

import java.util.Scanner;

public class ex7_Doc_So {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Đọc số nhập vào:");
        int number;
        do {
            System.out.println("Hãy nhập số có 1 chữ số:");
            number = input.nextInt();
            switch (number) {
                case 0:
                    System.out.println("Không");
                    break;
                case 1:
                    System.out.println("Một");
                    break;
                case 2:
                    System.out.println("Hai");
                    break;
                case 3:
                    System.out.println("Ba");
                    break;
                case 4:
                    System.out.println("Bốn");
                    break;
                case 5:
                    System.out.println("Năm");
                    break;
                case 6:
                    System.out.println("Sáu");
                    break;
                case 7:
                    System.out.println("Bảy");
                    break;
                case 8:
                    System.out.println("Tám");
                    break;
                case 9:
                    System.out.println("Chín");
                    break;
                default:
                    System.out.println("Hãy nhập số nguyên dương có 1 chữ số");
            }
        } while (number > 0 && number <10);

    }
}
