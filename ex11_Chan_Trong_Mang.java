package exercise.lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class ex11_Chan_Trong_Mang {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(-2);

        for (Integer number:arrayList) {
//            if (number%2==0){
//                System.out.println("Trong mảng có số chẵn là :" +number);
//            }
            if (number<0){
                System.out.println("Trong mảng có số âm là :" + number);
            }

        }
    }

}
