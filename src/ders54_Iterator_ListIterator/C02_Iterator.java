package ders54_Iterator_ListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {

    public static void main(String[] args) {


        List<Integer> sayilar1=new ArrayList<>(Arrays.asList(4,6,7,2,3,5,6,7,2,8));
        //ındeks kullnamadan sayilar listesindeki çift sayiları silin

        System.out.println(sayilar1);//[4, 6, 7, 2, 3, 5, 67, 2, 8]

        Iterator itr= sayilar1.iterator();

        while (itr.hasNext()) {

            //yanında eleman olduğu sürece true döndürür
            //listenin sonuna kadar gider, sona ulaştığında artık yanda elelman olmayacağı için false döner

       if ((Integer) itr.next()%2==0)  {

           itr.remove();
       }

            System.out.println(sayilar1);//[7, 3, 5, 7]

            //sayilar listesinin yeni halinde
            //ındex kullnamadan 5 den büyük sayıları silin

            System.out.println(itr.hasNext());//false


        }

        /*

yukarıda oluştruduğum itr obj sini yeni soruda kullanamyız
çünkü ensona kadar gittiğimiz için yanında eleman yok diyecektir

 */


        itr= sayilar1.iterator();// yeniden itr yi basta olacak sekilde oluşturur

        while (itr.hasNext()){

            if ((Integer)itr.next()>5){

                itr.remove();
            }
        }

        System.out.println(sayilar1); //[3, 5]
    }
}
