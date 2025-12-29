package TEKRAR.Konu29_ArrayListSoruCozumu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_IstenmeyenElementleriSilme {
    public static void main(String[] args) {

        List<String>isimler =new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Hatice"));
        // isimler listesinde "e" harfi iceren elementleri silin...

        System.out.println(istenmeyenElementiOlanıSil(isimler, "V"));//kucuk buyk harf önemli...


//        for (int i = 0; i < isimler.size(); i++) {
//
//            if (isimler.get(i).contains("e")){
//
//                isimler.remove(isimler.get(i));
//
//                i--; //kontrolden kaçakları kurtarmak icin eksilttik...
//            }
//
//        }
//        System.out.println(isimler); //[Ali, Fatma]






    }

    //bunu donduren bir metod yapalım....

    public static List<String>istenmeyenElementiOlanıSil(List<String>isimler,String istemeyenHarf){


        for (int i = 0; i < isimler.size(); i++) {

            if (isimler.get(i).contains(istemeyenHarf)){

                isimler.remove(isimler.get(i));

                i--; //kontrolden kaçakları kurtarmak icin eksilttik...
            }

        }


        return isimler;

    }

}
