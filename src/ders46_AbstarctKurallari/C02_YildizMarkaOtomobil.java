package ders46_AbstarctKurallari;

public class C02_YildizMarkaOtomobil extends C01_ArabaAbstaractClass {

    @Override
    public void motor() {

    }

    @Override
    public void sase() {

    }

    @Override
    public void gosterge() {

    }
//public abstract void method10();
 //Abstract method in non-abstract class

    public static void main(String[] args) {

     //C01_ArabaAbstaractClass araba1=new C01_ArabaAbstaractClass();
      // C01_ArabaAbstaractClass is abstract ;cannot be instantiated
      //  araba1.motor(); //motor methodnun bodysi yok
       // araba1.sase();//sase methodunun bodysi yok
      //abstract classlarin constructorları vardir
      // ANCAK abstract classlardan obje olusturulmasına java izin vermez
      //cunku obje olusturulursa o classlardaki abstract methodların calısması gerekir
      //oysa abstract methodlar normal bir method değil
      //kural cümlesi gibi olduklarından bodysi yoktur

    /*
    Abstract classlar class olduklalrı için constructor a sahiptir
    ANCAK abstract classdaki abstract methodlar ÇALIŞTIRILAMAYACAĞI için ABSTRACT CLASŞARDAN OBJE OLUŞTURULAMAZ
     */

  /*
    BİR ABSTRACT class a sonradan bir abstract method ekelnirse o abstract  class a extends etmis olan tum concrete classlar
   CTE veriri ve yeni eklenen abstract methodu tum child lara implement etmemiz gerekir
   */

  /*
  Abstract class in içinde hem abstract, hem de concrete method bulunabilir ancak concrete class da abstract method olmaz
   */





    }



}
