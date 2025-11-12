package TEKRAR.Konu13_StringManipulations;

import java.util.Locale;

public class C01_char {
    public static void main(String[] args) {

        //String class'in ozelliginden dolayi (immutable class), atama yapılmadan calistirilan
        // methodlar variable de KALICI degisiklik yapmazlar...KALICI DEĞİŞİKLİK İÇİN ATAMA ŞARTTIR..


String s="Bağ bağcınındır";

s=s.toUpperCase();

        System.out.println(s.toLowerCase(Locale.forLanguageTag("Tr")));//bağ bağcınındır


 //stringin ilk harfini yazıdırın

 String isim="Ramazan";
 char ilkHarf=isim.charAt(0);

        System.out.println(ilkHarf);

        //isimdeki bastan 5. harfi yazdirin

        System.out.println(isim.charAt(4));

        // son harfi yazdirin

        System.out.println(isim.charAt(isim.length()-1));

        // sondan 3. harfi yazidirin

        System.out.println(isim.charAt(isim.length()-3));

        // sondan 5. harfi yazıdırn

        System.out.println(isim.charAt(isim.length()-5));



    }
}
