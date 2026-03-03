package TEKRAR.Konu.Konu43_ConstructorCall;

public class C03_Corsa extends C02_Opel{

    C03_Corsa(){

        System.out.println("Corsa parametresiz constructor calisti");
    }


    String model="Corsa";
    String kasa="Corsa kasasi";
    String motor="vvdi";
    String lastik="15 inc Pirelli";

    String uretimYeri="Almanya";
    String aku="volta aku";

    public static void main(String[] args) {

        C03_Corsa corsa1=new C03_Corsa();
        System.out.println(corsa1.aku);//volta aku
        System.out.println(corsa1.model);//Co


        // child class dan olusuturulan bir obje
        // sadece kendi class'ındaki ozelliklere değil
        // parent classlardaki özelliklere de sahip olurlar

        System.out.println(corsa1.marka);//Opel
        System.out.println(corsa1.guvenlik);//dgs1001

/*
child class'ından olusturulan bir obje
sadece kendi classındaki özellikleri değil
paretnt classlardaki özelliklere sahip olurlar

2- bir obje olusturuldugunda objenin bir classdaki instance
variablelere sahip olması icin o class ın constructor ı calışmalıdır

3- o zaman child class da obje olusturulruken
parent class constructorlarında çalışması gerekir
yoksa child class da oluşturulan objeye yapışmaz

4- java bu işlemi gercekleştirmek için
extedns key word kullanan class larda basit bir kural
oluştıurmustur

Extend keywor kullanılan classlarda oluştururlan her constructrın
ilk satırında constructor CALLL olmak zorundadır...

5- eger kodu yazanlar ilk satıra constructor call yazmazlarsa
java default (varsayılan) olarak super constructor call koyar
yani ONCE parent class daki parametresiz constructor calışmalı der

 */




    }


}
