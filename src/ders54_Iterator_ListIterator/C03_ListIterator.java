package ders54_Iterator_ListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C03_ListIterator {

    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>(Arrays.asList(4,6,7,2,3,5,6));
        //ındeks kullanmadan sayilar listesindeki sayilari
        //1 er artırın

        ListIterator listIterator=sayilar.listIterator();

        System.out.println("Artrımadan önce sayilar :"+sayilar);
        //Artrımadan önce sayilar :[4, 6, 7, 2, 3, 5, 6]

        while (listIterator.hasNext()){

           Integer eskiDeger=(Integer) listIterator.next();
           listIterator.set(eskiDeger+1);

        }

        System.out.println("Artırmadan sonra :"+sayilar);
        //Artırmadan sonra :[5, 7, 8, 3, 4, 6, 7]


        //sayilar listesindeki sayıları sondan başa
        //doğru yazdırın

        /*

        ITERATOR ile çalışıldığında ilk sormamiz gereken soru ITERTATOR
        nerede ?

        bu soru için ITERATOR su an en sonda


         */


        while (listIterator.hasPrevious()){

            System.out.print(listIterator.previous()+" "); //7 6 4 3 8 7 5
        }

        System.out.println("");


//ındeks kullnamadan sayilar listesindeki çift sayıları silin

        while (listIterator.hasNext()){

            if ((Integer) listIterator.next()%2==0){

                listIterator.remove();
            }
        }

        System.out.println("çift sayıları sildikten sonra sayilar :"+sayilar);

//çift sayıları sildikten sonra sayilar :[5, 7, 3, 7]


    }
}
