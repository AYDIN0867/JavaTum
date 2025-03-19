package ders48_Interface;

public interface I02_Interfaces {


    public static final int sayi=20;
    public final String str="yasam candir";
   // public static char chr;
    boolean bl=true;

    public static void main(String[] args) {
        /*
        variable'larin onunde stattic yazmasa da
        static main method icinden kullanabiliriz
        cunku interface icindeki tum variable public,static ve finaldir...

         */

        System.out.println(bl);

        //sayi=30; //Cannot assign a value to final variable 'sayi'

        /*
        interface de sonradan atama yapamayacağımız icin basta deger atamak ZORUNLUDUR
         */

      //  chr ='a';
        //Cannot assign a value to final variable 'chr'

        //interfacelerin amacı child class için blue print olmaktır..
        //interface in en büyük avantajı inheritance de belli olur
        //class dan ınteface inherint etmek için ise implements keyword kullanılır
        // ınterface çoklu inheritanceyi destekler
        //to do list gibidir interface

    }














}
