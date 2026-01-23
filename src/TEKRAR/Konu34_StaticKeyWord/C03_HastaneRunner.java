package TEKRAR.Konu34_StaticKeyWord;

public class C03_HastaneRunner {
    public static void main(String[] args) {

   C02_HastaneStaticKeyWord hems1=new C02_HastaneStaticKeyWord() ;
        System.out.println(hems1);

/*
Instance Özellikler :perIsim='isim atanmamis --- perAdres='adres atanmamis ---perTel='tel atanmamis
Static ozellikler : hastaneIsmi : Yıldiz Hastanesi --- hastaneAdresi : Cankaya --- bashekim : Dr Esra

 */
        System.out.println(hems1.hastaneIsmi);
hems1.perIsim="Ayse";
hems1.perAdres="Cankaya";
hems1.perTel="09878876";
        System.out.println(hems1);
/*
Instance Özellikler :perIsim='Ayse --- perAdres='Cankaya ---perTel='09878876
Static ozellikler : hastaneIsmi : Yıldiz Hastanesi --- hastaneAdresi : Cankaya --- bashekim : Dr Esra

 */
C02_HastaneStaticKeyWord hems2=new C02_HastaneStaticKeyWord();
       // System.out.println(hems2);
hems2.perIsim="Fatma";
hems2.perAdres="YeniMahalle";

hems2.hastaneAdresi="Buca";
hems2.bashekim="Dr. Faruk";

//hems2

        System.out.println(hems2);

        System.out.println(hems1);


        C02_HastaneStaticKeyWord hems3=new C02_HastaneStaticKeyWord();
        hems3.perIsim="Leyla";
        hems3.hastaneAdresi="Balgat";

        System.out.println(hems3);
/*

Instance Özellikler :perIsim='Leyla --- perAdres='adres atanmamis ---perTel='tel atanmamis
Static ozellikler : hastaneIsmi : Yıldiz Hastanesi --- hastaneAdresi : Balgat --- bashekim : Dr. Faruk


 */



    }
}
