package ders44_Inheritance.D02Inheritance;

public class C03_Corolla extends C02_Totota{


    C03_Corolla(){

        //System.out.println(model);//belirtilmedi
    }

    String model="Coralla";
    String kasa="Coralla kasasi";
    String motor="vvdi";
    String lastik="15 inc piralli";

    String uretimYeri="Turkiye";
    String aku="Inci aku";
    String renk="renk secilmedi";
    String yakitTuru="yakit turu secilmedi";

    public static void main(String[] args) {


        C03_Corolla corolla1= new C03_Corolla();
        System.out.println(corolla1.sanzuman);
        corolla1.sanzuman="Otomatik";
        System.out.println(corolla1.marka);//toyota
        System.out.println(corolla1.guvenlik);//DGS1001
        System.out.println(corolla1.fren);//ABS

        System.out.println(corolla1.model);//CORALLA
        System.out.println(corolla1.kasa);//corolla kasası
        System.out.println(corolla1.motor);//vvdi
        System.out.println(corolla1.lastik);//15 inç pirelli
        corolla1.lastik="15 michelin";
        System.out.println(corolla1.uretimYeri);//turkiye
        System.out.println(corolla1.aku);//inci
        corolla1.renk="mavi";
        System.out.println(corolla1.renk);//mavi



    }


}
