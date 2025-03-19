package ders55_collections.linkedList;

import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedList_Qeue {

    public static void main(String[] args) {


        Queue<Integer> sayilar1=new LinkedList<>();
        Queue<Integer> sayilar2=new LinkedList<>();

        //sayilar1 listesine eleman ekleyelim

        sayilar1.add(10);
        sayilar1.add(15);
        sayilar1.add(12);
        sayilar1.add(24);
        sayilar1.add(45);
        sayilar1.add(34);
        sayilar1.add(46);
        sayilar1.add(56);

        System.out.println(sayilar1);//[10, 15, 12, 24, 45, 34, 46, 56] eklerken sona

        //sayilar1 listesinden eleman silelim

        sayilar1.remove();
        sayilar1.remove();
        System.out.println(sayilar1);//[12, 24, 45, 34, 46, 56] silerken baştan

        System.out.println(sayilar1.peek());//12
        System.out.println(sayilar1);//[12, 24, 45, 34, 46, 56]
        System.out.println(sayilar2.peek());//null

//element

        System.out.println(sayilar1.element());//12
                /*
              Retrieves, but does not remove, the head of this queue.
              This method differs from peek only in that it throws an exception if this queue is empty.

                 */

      //  System.out.println(sayilar2.element()); //Exception in thread "main" java.util.NoSuchElementException


        //poll()

        System.out.println(sayilar1.poll());//listeden 12 silerek getirir boş listede kullanılırsa null döndürür
//Retrieves and removes the head of this queue, or returns null if this queue is empty


        //offer

        System.out.println(sayilar1.offer(25));//true
        System.out.println(sayilar1);//true
//[24, 45, 34, 46, 56, 25]


    }
}
