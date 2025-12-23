package TEKRAR.Konu28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Remove {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>(Arrays.asList(4,6,1,9,3));
        List<String> isimler=new ArrayList<>(Arrays.asList("Ali","Veli","Cemil","Ayşe","Fatma","Hatice"));


        //isimler listesinden Aliyi silin

        isimler.remove("Ali");
        System.out.println(isimler);//[Veli, Cemil, Ayşe, Fatma, Hatice]

        //isimler listesinden ikinci ineksteki isimi silin

        isimler.remove(2);
        System.out.println(isimler);//[Veli, Cemil, Fatma, Hatice]

        //sayilar listesinden 1'i silin
        System.out.println(sayilar);//[4, 6, 1, 9, 3]

        sayilar.remove(1);
        System.out.println(sayilar);//[4, 1, 9, 3]

        //sayilar listesinden 9 u sil

        //sayilar.remove(9);
        /*

        eger list sayılardan oluşuyorsa java girilend eğeri direk indek alı
        eger sayı olan 4 u silmek istersek  bunu once obje oluşturmak gerekir ki nonprimitive olur
         */


        Integer silinecekSayi=9;
        sayilar.remove(silinecekSayi);
        System.out.println(sayilar); //[4, 1, 3]



    }
}
