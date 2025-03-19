package ders62_ComputeMethodları;

import java.util.Map;
import java.util.TreeMap;

public class C01_ElementSayma {

    public static void main(String[] args) {

        //verilen String bir array de
        // her bir elementi ve kacar defa kullanıldığını yazdırın

        String[] harfler = {"a", "b", "d", "a", "r", "a", "b", "d", "d", "a", "a", "t"};
        //outPut a:4, b:2,d:3,r:1


        Map<String, Integer> kullanımSayilariMap = new TreeMap<>();

        for (String eachharf
                : harfler) {
            if (kullanımSayilariMap.containsKey(eachharf)) {

                int eskikullanımSayısı = kullanımSayilariMap.get(eachharf);
                kullanımSayilariMap.put(eachharf,eskikullanımSayısı+1);
//daha önce map de var ,eski kullanım sayısını alıp
                // eski kullanım sayısının 1 fazlası olarak yeniden update ediyoruz

            }else {

                kullanımSayilariMap.put(eachharf,1);
                //daha once map de yok, degeri 1 olarak map e ekliyoruz
            }


        }
        System.out.println(kullanımSayilariMap); //{a=5, b=2, d=3, r=1, t=1}
    }
}