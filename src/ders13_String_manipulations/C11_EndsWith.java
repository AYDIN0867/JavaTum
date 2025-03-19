package ders13_String_manipulations;

public class C11_EndsWith {

    public static void main(String[] args) {


        String str="java ogrenmek cok zevkli";

        //metin zevkli ile mi bitiyor

        System.out.println(str.endsWith("zevkli"));//true
        System.out.println(str.endsWith("kli"));//true


        //metin zevkli içeriyor mu

        System.out.println(str.contains("zevkli"));//true

        // metin zevkli ile mi baslıyor

        str.startsWith("zevkli");

        //metin zevkli mi?

        System.out.println(str.equals("zevkli"));//false

        //metin li ile mi bitiyor

        System.out.println(str.endsWith("li"));//true
        System.out.println(str.endsWith("kli"));//true
        System.out.println(str.endsWith(""));//true

        String deneme="zeynep çok zeki öyleki";
        System.out.println(deneme);

        String kitap="amcam da çok zeki ki ablam da buna katılıyor";
        System.out.println(kitap);

        String resim="beyza kursa gidiyor";
        System.out.println(resim);

    }
}
