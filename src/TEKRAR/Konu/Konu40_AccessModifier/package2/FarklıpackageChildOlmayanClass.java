package TEKRAR.Konu.Konu40_AccessModifier.package2;

import TEKRAR.Konu.Konu40_AccessModifier.package1.Data;

public class FarklıpackageChildOlmayanClass {
    public static void main(String[] args) {

        //  System.out.println(Data.sayPrivate);
        // Data.metodPrivate();

     //   System.out.println(Data.strDefaultAccMod);
     //   Data.methodDefaultAccMod(); Olusturuldukları package Dısından kullanılmazlar...

    //    System.out.println(Data.chrProtected);
     //   Data.methodProtected(); //olusturuldukları child class değilse kullanılamaz..

        System.out.println(Data.dblPublic);
        Data.methodPublic(); //public olan heryerde ulaşılabilir...



    }
}
