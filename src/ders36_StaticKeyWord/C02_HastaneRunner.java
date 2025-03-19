package ders36_StaticKeyWord;

public class C02_HastaneRunner {

    public static void main(String[] args) {

        C01_Hastane hems1=new C01_Hastane();

        System.out.println(hems1);

//ınstance özellikler{perIsim='isim atanmamis', perAdres='adres atanmamais', perTel='adres atanmamais'
// static özellikler  :--------hastaneIsmi  : Yildiz hastanesi--------hastaneAdresi  :CankayabasHekim  :Dr Esra


        System.out.println(hems1.hastaneIsmi);//yıldız yazar  görmesinin sebebi hastaneIsminin static olmasıdır

        hems1.perIsim="Ayşe";
        hems1.perAdres="Cankaya";
        hems1.perTel="43251411212";
        System.out.println(hems1);
//ınstance özellikler{perIsim='Ayşe', perAdres='Cankaya', perTel='43251411212'
// static özellikler  :--------hastaneIsmi  : Yildiz hastanesi--------hastaneAdresi  :CankayabasHekim  :Dr Esra


        C01_Hastane hems2=new C01_Hastane();
        hems2.perIsim="Fatma";
        hems2.perAdres="yenimahalle";

        hems2.hastaneAdresi="yeni mahalle";
        hems2.bashekim="Dr Faruk";

        //hems2

        System.out.println(hems2);
//nstance özellikler{perIsim='Fatma', perAdres='yenimahalle', perTel='adres atanmamais'
// static özellikler  :--------hastaneIsmi  : Yildiz hastanesi--------hastaneAdresi  :yeni mahallebasHekim  :Dr Faruk

        System.out.println(hems1);
       // ınstance özellikler{perIsim='Ayşe', perAdres='Cankaya', perTel='43251411212'
         //   static özellikler  :--------hastaneIsmi  : Yildiz hastanesi--------hastaneAdresi  :yeni mahallebasHekim  :Dr Faruk

        //static bir variable değiştiğinde herkes için değişir


        C01_Hastane hems3=new C01_Hastane();

        hems3.perIsim="leyla";
        hems3.hastaneAdresi="balgat";

        System.out.println(hems3);
        //ınstance özellikler{perIsim='leyla', perAdres='adres atanmamais', perTel='adres atanmamais'
        // static özellikler  :--------hastaneIsmi  : Yildiz hastanesi--------hastaneAdresi  :balgatbasHekim  :Dr Faruk


        System.out.println(hems2);

        //ınstance özellikler{perIsim='Fatma', perAdres='yenimahalle', perTel='adres atanmamais'
        // static özellikler  :--------hastaneIsmi  : Yildiz hastanesi--------hastaneAdresi  :balgatbasHekim  :Dr Faruk
 //instance özellikler her hemsire için ayynı kalır fakat static olan hastane adresi için yapılan herkes için değişir
    }
}
