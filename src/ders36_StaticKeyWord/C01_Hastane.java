package ders36_StaticKeyWord;

public class C01_Hastane {

   static  String hastaneIsmi="Yildiz hastanesi";
   static  String hastaneAdresi="Cankaya";
   static  String bashekim="Dr Esra";


   String perIsim="isim atanmamis";
   String perAdres="adres atanmamais";
   String perTel="adres atanmamais";





















    @Override
    public String toString() {
        return "ınstance özellikler{" +
                "perIsim='" + perIsim + '\'' +
                ", perAdres='" + perAdres + '\'' +
                ", perTel='" + perTel + '\'' +
                "\n static özellikler  :"+
                "--------hastaneIsmi  : "+hastaneIsmi+
                "--------hastaneAdresi  :"+hastaneAdresi+
                "basHekim  :"+bashekim
                ;


    }
}
