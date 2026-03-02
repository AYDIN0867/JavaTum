package TEKRAR.Konu.Konu42_Inheritance;

public class C03_Corolla extends C02_Toyota {

    //hem toyota hem de araba class ındaki özellikeirni taşımalıdır
    C03_Corolla(){
//         System.out.println(model1);//Model belirtilmedi
//         System.out.println(motor1);// cevreye duyarlı olamlıdır
//        System.out.println(güvenlik);//DGS1001

    }



/*
2- cORALLA CLASS I parent ve grand paremt classlardaki
istedgiği variableleri kendisine uyarlaya bilir..
 */

    String model1="Corolla";
    String kasa="Corolla kasasi";
    String motor1="vvdi";
    String lastik="15 inch";

    /*

    3- yeni variableler de kelenebilir...
     */

String uretimYeri="Turkiye";
String aku="Inci aku";
String renk="renk secilmedi";
String yakitTuru="Dizel";

    public static void main(String[] args) {

        C03_Corolla corolla1=new C03_Corolla();
        System.out.println(corolla1.sanzuman);//belirtilmedi
        corolla1.sanzuman="otomatik";

        System.out.println(corolla1.marka1);//toyota
        System.out.println(corolla1.güvenlik);
        System.out.println(corolla1.firen);//ABS

        System.out.println(corolla1.model1);//corolla
        System.out.println(corolla1.kasa);//corolla kasası
        System.out.println(corolla1.motor1);//vvdi çünkü bu en günceli
        System.out.println(corolla1.lastik);//15 inc pirelli
        corolla1.lastik="15 inc michellin"; //değiştirebiliriz
        System.out.println(corolla1.uretimYeri);
        System.out.println(corolla1.aku);//inci aku
        corolla1.renk="Mavi";
        System.out.println(corolla1.renk);
        corolla1.yakitTuru="Benzin";
        System.out.println(corolla1.yakitTuru);//benzin


    }








}
