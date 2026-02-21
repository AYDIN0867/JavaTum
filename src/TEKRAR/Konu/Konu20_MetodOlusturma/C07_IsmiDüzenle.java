package TEKRAR.Konu.Konu20_MetodOlusturma;

public class C07_IsmiDüzenle {
    public static void main(String[] args) {

        /*
          Verilen isim ve soyismi alıp
          isim ve soyismin ilk harfi diğerleri küçük olarak düzenleyip..
          isim bosluk soyisim seklinde bize DONDUREN bir metod olusturun
          input : isim Ali soyisim:YILMAZ. metod return:Ali YILMAZ
         */

        System.out.println(isimDuzenle("ramazan", "aydın"));
        System.out.println(" ");
        System.out.println(isimDuzenle("ramazan aydın", "sumsamak"));

    }

    public static String isimDuzenle(String isim,String soyIsim){

     String  duzenlenmisIsim= isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()

     +" "+

       soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).toLowerCase();

       return duzenlenmisIsim;

    }


}
