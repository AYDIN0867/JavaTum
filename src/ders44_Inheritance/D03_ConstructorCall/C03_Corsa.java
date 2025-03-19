package ders44_Inheritance.D03_ConstructorCall;

public class C03_Corsa extends C02_Opel {

    C03_Corsa(){
        System.out.println(" Corsa parametresiz constructor calisti");
    }


    String model="Corsa";
    String kasa="Corsa kasasi";
    String motor="vvdi";
    String lastik="15 inc piralli";

    String uretimYeri="Almanya";
    String aku="volta aku";

    public static void main(String[] args) {

        C03_Corsa corsa1=new C03_Corsa();

        System.out.println(corsa1.aku);// volta aku
        System.out.println(corsa1.model);//Corsa

        /*

         1-child classdan oluşturulan obje sadece kendi classındanki
        // özelliklerine değil parent classındaki özelliklerede sahip olurlar

        2- bir obje oluşturulduğunda objenin bir class daki instance variablelere sahip olması için
        o class ın constructoru çalışmalıdır

        3- o zaman child class da obje oluşturulurken
         parent class constructorlarıdinda çalışması gerekir

        4- java bu işlemi gerçekleştirmek için extends keyword kullanan class larda bir kura vardır
        extends key word kullnana classlaeda oluşturulan HER CONSTRUCTORin ilk satırında Constructor
        Call olmak zorundadır

        5- eger kodu yazanlar ilk satıra constructor call yazmazlarsa java default olarak
        super constructor call koyar önce parent class daki parametresiz constructor calışmalı der

         */



        System.out.println(corsa1.marka);//opel
        System.out.println(corsa1.guvenlik);//DGS1001


    }

}
