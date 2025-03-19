package ders55_collections.linkedList;

import java.util.*;

public class C01_LinkedListOlusturma {

    public static void main(String[] args) {


        //List<> kullanarak bir isimler Listesi olusturun

       //List<String> isimler=new List<>(); //List' is abstract; cannot be instantiated

        /*
        List,Queue ve Deque Interface olduklarından OBJE olusturulamaz
        ancak child classlari olan LinkedList constructor'ini kullanabilirler

         */

        List<String> isimler1=new ArrayList<>();



        List<String> isimler2=new LinkedList<>();

        Queue<String> isimler3=new LinkedList<>();

        Deque<String> isimler4=new LinkedList<>();

        LinkedList<String> isimler5=new LinkedList<>();
        /*
        isimler2 isimler3 ve  isismler4 objelerinin  hepsi LinkedList  class'inin objeleridir.
        hepsi ayni class'in objesi oldukları halde Data turleri farklı interfaceler secildiği için
        bu 3 obje cok farklı ozellikler gösterir
         */








    }
}
