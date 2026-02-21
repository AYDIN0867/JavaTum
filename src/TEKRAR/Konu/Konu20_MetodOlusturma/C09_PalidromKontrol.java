package TEKRAR.Konu.Konu20_MetodOlusturma;

public class C09_PalidromKontrol {
    public static void main(String[] args) {

        // verilen metnin palidrom olup olmadıgını kontrol edip,
        // palindrome ise true, değilse false donduren bir metod oluşturun




    }

    public static Boolean isPalindrome(String metin) {

        String tersMetin = C08_TerstenYazdir.tersYazılısınıDondur(metin);

        if (tersMetin.equalsIgnoreCase(metin)) {

          //  System.out.println("verilen metin palidrom");

            return true;

        } else {

          //  System.out.println("verilen metin palidrom değil");

            return false;


        }


    }
}