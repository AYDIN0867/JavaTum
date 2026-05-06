package ders19_Method;

public class C08_IsmiDuzenle {
    public static void main(String[] args) {

        //Verilen isim ve soyismi alip
        //Isim ve soyısmi ilk harfleri buyuk diğer harfler kucuk olacak sekilde duzenleyip
        //isim bosluk osy isim seklinde donduren metod olusturun

        //input : isim : Ali soyisim: YILMAZ metod return Ali Yilmaz

        String isim="Murat";
        String soyisim="Turat";

        System.out.println(ismiDuzenleDondur(isim, soyisim));//kossolde gorunuz sonra kulanamayız


        System.out.println(isim);
        isim=ismiDuzenleDondur(isim,soyisim);
        System.out.println(isim);
    }

    public static String ismiDuzenleDondur(String isim,String soyisim){



          String duzenlenmisIsim=isim.substring(0,1).toUpperCase()+
                  " "+isim.substring(1).toLowerCase()+
                " "+
                soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).toLowerCase();




        return duzenlenmisIsim ;
    }
}
