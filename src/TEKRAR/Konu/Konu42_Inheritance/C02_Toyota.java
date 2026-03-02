package TEKRAR.Konu.Konu42_Inheritance;

public class C02_Toyota extends C01_Araba {

    //sadece toyota dediğimiz araba yoktur
    //illaki modeli vardır
    //ve modeller içinde bir çatı class dır
    //toyota br arabadır o zaman araba class ın daki miras alabilirim
    //exteds ile bu class ı child ettik

    protected C02_Toyota(){

//        System.out.println(marka1);
//        marka1="Toyota";
//        System.out.println(kasa);
//        //her ne kadar child olsa da bu catı classdır

    }
/*
Toyota class ı isterse parent class i olan Araba class ındaki
bazi variableleri kendimize uyarlayabiliriz


 */

    protected String marka1="Toyota";
    protected  String motor1="Cevreye duyarlı motor";

   /*

   child classlar isterse parent da olmayan özellikleri
   de ekleyebilir...
    */

    protected  String lastik="Pirelli";
    protected  String güvenlik="DGS1001";
    protected  String firen="ABS";


/*
bu durumda toyota class'indan olusturulacak obje
olsa Araba class ından 3 adet (model, sanzuman, kasa)
guncellendiği 2 adet (marka,motor) ve yeni eklediği 3 adet
(lastik, guvenlik, fren)
toplam 8 ozelliğe sahip olur...
 */

//kendisinden obje oluturlmayacak çatı class olacak




}
