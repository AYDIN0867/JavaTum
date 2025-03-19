package ders31_ArrayListSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_VerilenArrayiListeCevirme {

    public static void main(String[] args) {

        //verilen array'i list olarak kaydetmek

        Integer [] arr={3,5,6,7,8,9,2,3,5,3,4,6,2,7};

        //boş bir list oluşturulur for loop ile arraydeki elementleri listeye eklemek

        List<Integer> sayilar=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            sayilar.add(arr[i]);

        }
        sayilar.add(10);
 sayilar.add(20);
 sayilar.remove(0);
 sayilar.remove(0);

        System.out.println("for loop ile oluşan liste"+sayilar);


        /*


        arrays clasında bu işi yapan aslist methodu var ancak iki tane kullanışşız yan etkisi var ve tercih edilemz
        arrays classi kullanıldığı için ekleme ve removeye izin vermez

                */


        List<Integer>yeniList= Arrays.asList(arr);

        System.out.println(yeniList);

        //yeniList.add(10);UnsupportedOperationException

        arr[0]=10;
        arr[1]=20;

        System.out.println("arreye atama yaptıktan somnra liste"+yeniList); //arraye atama yapmışken listeyide değiştirdi


    }
}
