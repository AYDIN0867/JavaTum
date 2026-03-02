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

    protected String marka="Toyota";
    protected  String motor="Cevreye duyarlı motor";

   /*

   child classlar isterse parent da olmayan özellikleri
   de ekleyebilir...
    */

    protected  String lastik="Pirelli";
    protected  String güvenlik="DGS1001";
    protected  String firen="ABS";





}
