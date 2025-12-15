package TEKRAR.Konu24_Scope;

public class HastaneStatic {

    static String hastaneIsmi="Yildiz Hastanesi";
    static String hastaneAdresi="YeniMahalle";
    static String basHekim="Doktor Remezan";

    String perIsmi="Isim atanmadi";
    String perAdres="Adres atanmadi";
    String perTel="Telefon atanmadi";


    public static void main(String[] args) {

        System.out.println(hastaneIsmi);//ayrıcalıklı oldugu için yazdırılır....
        //System.out.println(perIsmi); perIsmi instance oldugu için hata verir ama obje ile ulaşabiliriz..
        HastaneStatic per1=new HastaneStatic();
        System.out.println(per1.hastaneAdresi);//hastaneAdresi zaten static neden obje ile ulaştın diye altını sarı çiziyor
        //ve consolde 20 satırda YeniMahalle yazılacaktır...
        System.out.println(per1.basHekim);//Doktor Remezan yazılacaktır...


    }
}
