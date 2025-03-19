package ders41_StringBuilder;

public class C03_StringBuilderda_StringMethodlariKullanma {

    public static void main(String[] args) {


        StringBuilder sb=new StringBuilder("Java Candir");
        //sb "a" içerir mi?

        /*

        eger stringbuilderda olmayan ama stringde olan methodları kullanmak için tostring kullanılır
         */

        System.out.println(sb.toString().contains("a"));//true

        /*
        not2: StringBuilder methodlarından return type StringBuilder olanlar kalıcı değişiklik yaparlar.
        Ancak return type leri StringBuilder olmayanlar kalıcı değişiklik yapmaz
         */
        System.out.println(sb.substring(0, 4));//java

        System.out.println(sb);//Java Candir




    }
}
