package TEKRAR.Konu28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_IstenenElementleriKullanma {
    public static void main(String[] args) {

        int [] arr ={3,5,6,8,1};
//arr deki elementlerin toplamı...
        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            toplam+=arr[i];

        }


        System.out.println("array deki elelemtlerin toplamı :" + toplam);

        List<Integer> sayilar=new ArrayList<>(Arrays.asList(3,6,8,1,4,0));
        // sayilar listesinin 2  indeksindeki sayiyi yazdırın...

        System.out.println(sayilar.get(2));//8
        System.out.println(sayilar.get(0));//3
        System.out.println(sayilar.get(5));//0
       // System.out.println(sayilar.get(10));//10. indeks olmadıgı için IndexOutOfBoundException firlatır...

     //sayilar listesindeki tum elementleri toplayın...


     toplam=0;

        for (int i = 0; i < sayilar.size(); i++) {

            toplam+= sayilar.get(i);

        }

        System.out.println("sayilar listesindeki ellementlerin toplamı :" +toplam);//sayilar listesindeki ellementlerin toplamı :22

        System.out.println(sayilar);//[3, 6, 8, 1, 4, 0]

        //2. index deki elementi 5 yapın

        sayilar.set(2,5);
        System.out.println(sayilar);//[3, 6, 5, 1, 4, 0]









    }
}
