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


     //sayilar listesinde 4. index deki elementi 11 yapın...
        sayilar.set(4,11);
        System.out.println(sayilar);//[3, 6, 5, 1, 11, 0]

        sayilar.set(0,12);
        System.out.println(sayilar);//[12, 6, 5, 1, 11, 0]

        //sayilar listesindeki 4. index'e 23 ekleyin...

        sayilar.set(4,23);
        System.out.println(sayilar); //[12, 6, 5, 1, 23, 0]
        //set 4 indeksteki 11 i sildi yerine 23 koydu

        sayilar.add(4,12);
        System.out.println(sayilar);//add ise 4. indeksteki 23 ü silmeden
        //23 ü iterek önüne 12 yi ekleyecek
        //[12, 6, 5, 1, 12, 23, 0]

        System.out.println(sayilar.get(3));//1

/*
add () yeni bir element ekler,element sayısı bir artar
ve eklendiği indeksden sonraki elementler 1 geriye itilir...

set() yeni element eklmez,listenin eleman sayısı aynı kalır
sadece verilen index deki element update edilmiş olur...

 */






    }
}
