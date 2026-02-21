package TEKRAR.Konu.Konu24_Scope;

public class Hastane {

static String hastaneIsmi="Yildiz Hastanesi";
static String hastaneAdresi="YeniMahalle";
static String basHekim="Doktor Remezan";

String perIsmi="Isim atanmadi";
String perAdres="Adres atanmadi";
String perTel="Telefon atanmadi";





    public static void main(String[] args) {

        Hastane per1=new Hastane();
        System.out.println(per1.perIsmi);//şuan Isim atanmadi
        System.out.println(per1.perAdres);//şuan Adres atanmadı
        System.out.println(per1.perTel);//şuan Adres atanmadı

        per1.perIsmi="Ali ÇAVUŞ";
        per1.perAdres="KUMBURGAZ";
        per1.perTel="056787676";
        System.out.println(per1.perIsmi);//şimdi ise Ali ÇAVUŞ
        System.out.println(per1.perAdres);//şimdi ise KUMBURGAZ
        System.out.println(per1.perTel);//şimdi ise 056787676

        Hastane per2=new Hastane();
        per2.perIsmi="Tansu";
        per2.perAdres="ÇOLAKLI";
        per2.perTel="93878767";

        Hastane per3=new Hastane();
        per3.perAdres="UNYE";

        System.out.println(per1.perAdres);//KUMBURGAZ
        System.out.println(per2.perAdres);//ÇOLAKLI
        System.out.println(per3.perAdres);//UNYE
        System.out.println(per1.perIsmi);//"Ali ÇAVUŞ"
        System.out.println(per2.perIsmi);//"Tansu"
        System.out.println(per3.perIsmi);//Atanmadı



    }
}
