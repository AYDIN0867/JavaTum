package ders13_String_manipulations;

import java.util.Locale;

public class C01_StringtoupperLowerCase {

    public static void main(String[] args) {

       String str="Java Candir";

        System.out.println(str.toUpperCase());//JAVA CANDIR
        System.out.println(str.toLowerCase());// java candir atama yapılamdığı için sadece
        // yazdırmıştır ama str ın değeri hala "Java Candir"

        System.out.println(str);

// kalıcı değişiklik şöyle değiştirilir

        str=str.toUpperCase();
        System.out.println(str);

        // bir harfin büyüğü küçük arasında fark varsa aşağıdaki yöntem kullanılır


        String s="Bağ bağcınındır";
        System.out.println(s.toUpperCase());//BAĞ BAĞCININDIR
        s=s.toUpperCase();

        System.out.println(s.toLowerCase());

        System.out.println(s.toLowerCase(Locale.forLanguageTag("Tr")));

    }
}
