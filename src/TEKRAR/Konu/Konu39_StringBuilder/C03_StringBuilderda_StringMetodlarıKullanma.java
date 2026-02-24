package TEKRAR.Konu.Konu39_StringBuilder;

public class C03_StringBuilderda_StringMetodlarıKullanma {
    public static void main(String[] args) {


    StringBuilder sb=new StringBuilder("umut etmek ekmek almaktır");

    /*
    eger string<builder da olamyan ama strigde olan
    metodlar kullanılmak istedgiğinde toString() ile stringe donuşturulur

     */

        System.out.println(sb.toString().contains("a"));//true

        /*
StringNuilder metodlarından return type string<builder olanlar kalıcı değişkilik yaparlar
         */

        System.out.println(sb.substring(0, 4));//umut
        System.out.println(sb); //umut etmek ekmek almaktır
        System.out.println(sb.length());//25

    }
}
