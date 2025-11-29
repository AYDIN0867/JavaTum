package TEKRAR.Konu20_MetodOlusturma;

public class C02_MetodKullanımıSoruCozumu2 {
    public static void main(String[] args) {

        String metin = "Java Candir";

        int basIndex = 0;
        int bitIndex = 1;

        /*
            Kullanicidan alinan bir metinden
            kullanicinin girdigi baslangic ve bitis indexleri arasindaki kismi yazdirin

            Kurallar :
            1- eger baslangic veya bitis index'i negatif veya metnin sinirlari disinda ise hata verin
            2- baslangic index'i bitis index'inden buyukse hata mesaji verin
            3- baslangic indexindeki karakter dahil, bitis indexindeki karakter haric olmalidir

         */

        if (basIndex < 0 || bitIndex < 0) {

            System.out.println("Hata mesajı ver...");

        } else if (!(basIndex < metin.length()) || (!(bitIndex < metin.length()))) {

            System.out.println("hata mesajı ver...");

        } else if (basIndex > bitIndex) {

            System.out.println("hata mesajı olamaz");


        }else {

            for (int i = basIndex; i <bitIndex ; i++) {

                System.out.println(metin.charAt(i));

            }


        }
    }
}