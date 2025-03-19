package ders38_ImmutableClasess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_mutableClasses {

    public static void main(String[] args) {

       String str="Fatmam candir";
       //immutable Class!larda methodlarla yapılan deşiklikler KALICI OLMAZ

        str.toUpperCase();

        System.out.println(str.substring(2)); //tmam candir
        System.out.println(str);//Fatmam candir

        System.out.println(str);//Fatmam candir

        List<String> isimler=new ArrayList<>(Arrays.asList("Cansu","Asuman","Hamza"));
        //mutable classlarda methodlarla yapılan değişiklikler KALICI OLUR

        System.out.println(isimler);//[Cansu, Asuman, Hamza]
        isimler.add("Ali");
        System.out.println(isimler.remove(0));//delil olarak cansuyu getirdi ve sildi

        System.out.println(isimler);//[Asuman, Hamza, Ali]





    }
}
