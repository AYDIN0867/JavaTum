package TEKRAR.Konu34_StaticKeyWord;

public class C02_HastaneStaticKeyWord {

    static String hastaneIsmi="Yıldiz Hastanesi";
    static String hastaneAdresi="Cankaya";
    static String bashekim="Dr Esra";

    String perIsim="isim atanmamis";
    String perAdres="adres atanmamis";
    String perTel="tel atanmamis";













    @Override
    public String toString() {
        return "Instance Özellikler :" +
                "perIsim='" + perIsim +
                " --- perAdres='" + perAdres +
                " ---perTel='" + perTel +
                "\nStatic ozellikler : "+
                "hastaneIsmi : "+ hastaneIsmi+
                " --- hastaneAdresi : "+ hastaneAdresi+
                " --- bashekim : "+bashekim;

    }
}
