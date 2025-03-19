package ders37_PasByValue;

public class C04_IndirimliFiyatYazdirma {

    public static void main(String[] args) {

    // 3 farkli method oluşturup
    // verilen fiyat variable'ina %10,%20 ve %40 indirim yapin
    //method larda fiyatın indirimli halini kaydedip
    //"urunun %10 indirimli fiyatı:90" şeklinde yazdirin


    double fiyat=200;

    indirimliFiyatiYazdir10(fiyat);//%10 indirimli fiyat : 180.0
    indirimliFiyatiYazdir20(fiyat);//%20 indirimli fiyat : 160.0
    indirimliFiyatiYazdir40(fiyat);//%40 indirimli fiyat : 120.0
    indirimliFiyatiYazdir40(fiyat);//%40 indirimli fiyat : 120.0




    }

    public static void indirimliFiyatiYazdir40(double fiyat) {

        fiyat*=0.60;

        System.out.println("%40 indirimli fiyat : "+fiyat);
            }

    public static void indirimliFiyatiYazdir20(double fiyat) {

        fiyat*=0.80;

        System.out.println("%20 indirimli fiyat : "+fiyat);
    }

    public static void indirimliFiyatiYazdir10(double fiyat) {

        fiyat*=0.90;

        System.out.println("%10 indirimli fiyat : "+fiyat);

    }
}
