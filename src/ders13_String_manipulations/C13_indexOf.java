package ders13_String_manipulations;

public class C13_indexOf {

    public static void main(String[] args) {

        String str="cok calismam lazım, cok";

        //str "calis" iceriyor mu?
        System.out.println(str.contains("calis"));//true

        // str "calis" ile mi basliyor?
        System.out.println(str.startsWith("calis"));//false

        // str "calis" ile mi bitiyor?
        System.out.println(str.endsWith("calis"));//false


        //  pekıı bu calis cümlenin neresinde
        System.out.println(str.indexOf("calis"));//4

        //str de kullanılan ilk 'a'nin indeksi
        System.out.println(str.indexOf("a"));//5


        //str 'de kullanılan ilk "cok" un indeksi

        System.out.println(str.indexOf("cok"));//0

        //str da kulanılan ilk spacenin indeksi
//cok calismam lazım, cok
        System.out.println(str.indexOf(" "));//3

        //str da kullanılan ilk 'a' nın indeksinin
        // 5 olduğu bilindiğine göre ikinci anın indeksi nedir

        System.out.println(str.indexOf('a', 6));//10

        //str'de ilk cok un indeksinin 0 olduğu biliniyorsa
        // ikinci kullanılan cok un indeksi nedir
        System.out.println(str.indexOf("cok", 1));//20

        System.out.println(str.indexOf("x"));//olmayana eksi değer verir -1


    }
}
