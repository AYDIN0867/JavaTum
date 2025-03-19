package ders47_Abstraction;

public abstract class C09_AbstarctParent extends C08_AbstractGrandParent {
   //Class 'C09_AbstarctParent' must either be declared abstract or
    // implement abstract method 'method1()' in 'C08_AbstractGrandParent'

    /*
    abstract bir class a yeni kurallar ve yeni ortak özellikler eklemek için
    abstract child class oluşturulbilir
    arabab classında belirlenen  özelliklere ek olarak Toyata marka arabalara
    ortak özellike belirlemek isterseniz araba clasına extends eden abstract Toyota class ı
    oluşturabiliriz

     */

    void method1(){

        System.out.println("parent method1");
    }

    abstract void method5();
    abstract int method6();



}
