package ders12_String_Manipulations;

import java.util.Locale;

public class C01_String_manipulations {

    public static void main(String[] args) {

        String str="java candir";
        str.toUpperCase();

        /* 8. satırdaki işlem çalışır ve bize JAVA CANDIR getirir.

        amam biz bu sonucu sout yapmadığımız için göremeyiz.Ayrıca str a
         atama yapmadğımız için str değişmez yani 8. satırdaki kod çalıştı ama boşa çalıştı
         */

        System.out.println(str);// java candir



        // str ı küçük harflerle yazdırın
        System.out.println(str.toLowerCase());
        System.out.println("22. satırda str"+str);//java candir

        // atama yapmadığımız için değişiklik kalıcı olmaz

        str=str.toUpperCase(); // str burada büyük harflerle yazılı şekilde kaydetmiş oluruz
        System.out.println("27. satırda"+str);
// str harfi küçük harflere çeviripi yazdırın ancak










        System.out.println(str.toLowerCase());//java candir

        //str ı küçük harfe çevirirken türkçe karakter ile java candır yazdırın
        // ingilizce de i harfi büyütülürse I olur

        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR")));//java candır

        System.out.println(str);




    }
}
