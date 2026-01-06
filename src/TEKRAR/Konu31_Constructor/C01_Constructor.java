package TEKRAR.Konu31_Constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_Constructor {
    public static void main(String[] args) {

  // Bir class dan obje oluşturdugumuzda o class daki özelliklere ulaşabiliriz...


        Scanner scanner=new Scanner(System.in);

        Random random=new Random();

        String str=new String("ali");

        List<Integer> sayilar=new ArrayList<>();

        /*

        Java' da surekli kullanacagımız özellikleri class'lara yerleştiririz
        Herhangi bir class'daki özelliklere (variable ve metodlar) ulasabilmek icin
        o ozelliklerin bulundugu class'dan bir obje olusturabiliriz....

        Ornegin bugune kadar olusturdugumuz scanner objesi sayesinde
        Javanın Scanner Class'ina koydugu hazir metodlar'lari kullandık

        Bugunku konumuzda Java'nın objeyi nasıl olusturdugunun
        ve olusturuldugu class'daki ozellikleri nasıl objeye yuklendigini gorecegiz...


         */

        Scanner                       scanner1        =                  new                    Scanner(System.in);
  //Class ismi                      obje ismi      assigment sign       keyword                    Constructor(isimleri Class ismi ile aynıdır9


        List   <Integer>   sayilar1     =       new          ArrayList<>();


        /*

      Java'da bir obje olusturup ilk deger atamasi yapmak icin
      MUTLAKA bir Constructor ÇALIŞMALIDIR...

         */


    }
}
