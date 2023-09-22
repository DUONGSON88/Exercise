package exercise.lv1;

import java.util.ArrayList;

public class ex12_TongCacSoLeTrongMang {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();

      arrayList.add(1);
      arrayList.add(3);
      arrayList.add(2);
      arrayList.add(4);
      arrayList.add(7);
      arrayList.add(9);

      System.out.println(arrayList);

        for (Integer number:arrayList) {
            if (arrayList.get(number)%2!=0){
                System.out.println(number);
            }
        }
    }
}
