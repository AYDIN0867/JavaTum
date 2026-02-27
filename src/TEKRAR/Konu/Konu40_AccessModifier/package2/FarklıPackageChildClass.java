package TEKRAR.Konu.Konu40_AccessModifier.package2;

import TEKRAR.Konu.Konu40_AccessModifier.package1.Data;

public class FarklıPackageChildClass extends Data {
    public static void main(String[] args) {

        //  System.out.println(Data.sayPrivate);
        // Data.metodPrivate();

      //  System.out.println(Data.strDefaultAccMod);
      //  Data.methodDefaultAccMod();

        System.out.println(Data.chrProtected);
        Data.methodProtected();

        System.out.println(Data.dblPublic);
        Data.methodPublic();



    }
}
