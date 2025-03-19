package ders13_String_manipulations;

public class C06_StringSubString {

    public static void main(String[] args) {

String metin="java gun gectikce guzellesiyor";
        System.out.println(metin.length());

// metnin 12. karakterini yazdırın
        System.out.println(metin.charAt(11));

 //10. karakterden sona kadar dediğimizde ise substring kullanılır

        System.out.println(metin.substring(9));

        //ilk kelime hariç geriye kalan metni yazıdırmak

        System.out.println(metin.indexOf(" "));//4
        System.out.println(metin.substring(5));
        // ilk harf hariç kalan metni yazdıralım

        System.out.println(metin.substring(1));

        // son beş karakterini yazdırın

        System.out.println(metin.substring(metin.length()-5));

        // bu metinde length 30 son harfin indeksi ise 29

        // şimdi son karakteri charAt ile yazdıralım
        System.out.println(metin.charAt(metin.length()-1));
        System.out.println(metin.substring(metin.length()-1));
      //  System.out.println(metin.charAt(metin.length()));// son harf olan r den sonra karakter
        // olmadığı için string out of hatası veriri substring ile yazarsak hata vermez hiçlik verir

        System.out.println(metin.substring(metin.length()));


    }
}
