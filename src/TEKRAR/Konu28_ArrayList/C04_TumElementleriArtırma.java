package TEKRAR.Konu28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_TumElementleriArtırma {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>(Arrays.asList(4,6,1,9,3));
        //sayilar listesindeki tum elementleri 4 artırın


        for (int i = 0; i < sayilar.size(); i++) {

            int eskiDeger=sayilar.get(i);
            sayilar.set(i,eskiDeger+4);



        }

        System.out.println(sayilar); //[8, 10, 5, 13, 7]

    }

  //


}
