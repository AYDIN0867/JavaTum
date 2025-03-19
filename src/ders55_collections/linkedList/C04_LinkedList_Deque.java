package ders55_collections.linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C04_LinkedList_Deque {


    public static void main(String[] args) {


        Deque<Integer> sayilar=new LinkedList<>();

        // sayilara a eleman ekleyelim

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        System.out.println(sayilar);//[10, 20, 30]


        sayilar.addFirst(12);
        sayilar.addLast(45);
        System.out.println(sayilar);
sayilar.add(20);
sayilar.add(20);
        System.out.println(sayilar); //[12, 10, 20, 30, 45, 20, 20]

        //sayilardan elelman silelim

        System.out.println(sayilar.remove());//12 hem sileck hemde bize getirecek
        System.out.println(sayilar);

        System.out.println(sayilar.removeFirstOccurrence(20));//true 20 nin ilk kullanımını siler
        System.out.println(sayilar); //[10, 30, 45, 20, 20]

        System.out.println(sayilar.removeFirstOccurrence(40));//olmadığı için false



        System.out.println(sayilar);

       sayilar.push(44);
        System.out.println(sayilar);


    }
}
