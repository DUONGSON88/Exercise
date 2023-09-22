package exercise.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex10_Tao_So_Tu3So {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Đếm các cách có thể tạo đc số có 3 chữ số nhập vào điều kiện các số không trùng nhau và khác 0");
        System.out.println("Nhập số A");
        int numberA = input.nextInt();
        System.out.println("Nhập số  B");
        int numberB = input.nextInt();
        System.out.println("Nhập số r C");
        int numberC = input.nextInt();

        ThreeNumberCount(numberA, numberB, numberC);

    }


    public static void ThreeNumberCount(int number1, int number2, int number3) {
        int count = 0;
        int[] arr = new int[]{number1, number2, number3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {

//                    if (arr[i] != arr[j] && arr[i]!= arr[k] && arr[j]!=arr[k]) {
//                        System.out.println("" + arr[i] + arr[j] + arr[k]);
//                        count++;
                    if (arr[i] == arr[j] && arr[i] != arr[k]){
                        System.out.println("" + arr[i] + arr[j] + arr[k]);
                        count++;
                    }
//                    if (arr[i] != arr[j] && arr[i] == arr[k]){
//                        System.out.println("" + arr[i] + arr[j] + arr[k]);
//                        count++;
//                    }
//

                }
            }
        }
        System.out.println("có :" + count + " cách .");

    }
}