package ders31_ArrayListSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_IstenmeyenElementleriSilme {




    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>(Arrays.asList("Ali","Veli","Cemil","Ayse","Fatma","Hatice"));
        //isimler listesinde "e" harfi içeren elementleri silin


        System.out.println(ıstenmeyeniSıl(isimler, "e"));


        //verilen String bir listede
        //istenmeyen harf içeren elementleri silip
        //kalan kismi list olarak bize döndüren bir method oluşturun




    }

    public static List<String> ıstenmeyeniSıl( List<String> isimler,String istenmeyenHarf) {

        for (int i = 0; i < isimler.size(); i++) {

            if(isimler.get(i).contains(istenmeyenHarf)){

                isimler.remove(isimler.get(i));//listeden i ile kontrol yapıldığında ve
                // bir silme işlemi olduğında i 1 azaltılır
                i--;
            }

        }
        return isimler;

    }

}
