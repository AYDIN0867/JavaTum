package TEKRAR.Konu31_Constructor;

public class C03_OkulRunner {

    //C02_Okul class'inda bir obje olusturup, objeyi kullanılım
    public static void main(String[] args) {

        C02_Okul ogrenci1=new C02_Okul();

        System.out.println(ogrenci1.ogrgIsim);//isim atanmamis
        ogrenci1.ogrgIsim="Ali";
        ogrenci1.ogrAdres="Cankaya";
        ogrenci1.ogrTel="05344565656";

        System.out.println(ogrenci1.ogrgIsim);//Ali
        System.out.println(ogrenci1.ogrAdres);//Cankaya
        System.out.println(ogrenci1.ogrTel);//

//objenin oluşturulup ilk deger ataması constructor tarafından sağlanır


//C02_Okul class'indan bir obje deklare edip ataması yapmayalım...

C02_Okul ogrenci2;
    //    System.out.println(ogrenci2.ogrgIsim); contructor olmadıgı için
        //java ogrenci2 nin altını çizer....
        // bir obje icin constructor calışmazsa
        //o obje oluşturulup ilk deger ataması (initialize) YAPILAMAZ

C02_Okul ogrenci3=null;

       // System.out.println(ogrenci3.ogrgIsim);
//null bir değer değildir...constructor çalışmadı...
//çalıştırılınca null point exception verir...

  // C02_Okul class ından deklare etmeden bir obje oluşturup kullanlım


        System.out.println(new C02_Okul().ogrgIsim);
//isim atanmamis

        new C02_Okul().ogrgIsim="Mehmet";
//obje oluştu ama sadece 42. satır için oluşturmuştur
// sonraki satırlar icin bu objenin çalışması mümkün değildir


/*
obje deklre edilmeden contructor çalışırsa sadece o satır için obje çalışır
objenin bir ismi olmaz...

 */





    }






}
