package ders62_ComputeMethodları;

import java.util.Map;
import java.util.TreeMap;

public class C03_KullanımAdetleriniBulma {

    public static void main(String[] args) {


        String[] harfler = {"a", "b", "d", "a", "r", "a", "b", "d", "d", "a", "a", "t"};

        Map<String,Integer> harfKullanımsayilariMap=new TreeMap<>();

        for (String eachHarf
                 :  harfler ) {

            harfKullanımsayilariMap.computeIfPresent(eachHarf,(k,v)->v+1);
            harfKullanımsayilariMap.putIfAbsent(eachHarf,1);

           }

        System.out.println(harfKullanımsayilariMap);

    }
}
