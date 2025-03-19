package ders54_Iterator_ListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {

    public static void main(String[] args) {

        int [] arr={3,5,6,1,2,4,5};

        // arr'in tum elementlerini 1 er artirin

    //    for (int i = 0; i < arr.length; i++) {

       //     arr[i]+=1;

     //   }

    //    System.out.println(Arrays.toString(arr));

  //indeks kullnamadan arr in tum elemanlarını 2 artırın

  for ( int each
           :arr   ) {

      System.out.print((each+=2)+" ");//5 7 8 3 4 6 7

      System.out.println("");




  }

        System.out.println(Arrays.toString(arr));//[3, 5, 6, 1, 2, 4, 5]

     /*
      INDEX kullnamadan arraydeki tum elemanlari for-each loop ile elden gecirebiliriz
      ancak for each loop ile kalıcı değişiklik yapamayız


      */

        List<Integer> sayilar=new ArrayList<>(Arrays.asList(5,6,7));
        //Index kullanamadan sayilar listesindeki tek sayilari silin

        Iterator itr= sayilar.iterator();

        System.out.println(itr.hasNext());//true
        //itr.next nerde çalıştırıldığı onemli olmadan yandaki sayının onune gider
        //üzerinden gectiği sayiyı içine alır.

        if ((Integer) itr.next()% 2!=0){

            itr.remove();
        }

        if ((Integer) itr.next()% 2!=0){

            itr.remove();
        }

        if ((Integer) itr.next()% 2!=0){

            itr.remove();
        }


        System.out.println(sayilar); //[6]

    }
}
