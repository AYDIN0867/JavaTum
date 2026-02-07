package TEKRAR.Konu36_ImmuTableClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ImmutableClass {

    public static void main(String[] args) {


        String str="Az ye Az konus";
        //immutable class larda metodlarla yapılan değişiklik KALICI olmaz

        str.toUpperCase();
        System.out.println(str.substring(2)); //ye Az konus

        System.out.println(str);//Az ye Az konus

        List<String> isimler=new ArrayList<>(Arrays.asList("Cansu","Asuman","Hamza"));
        //mutable Classlarda metod ile yapılan değğişiklikm kalıcı olur
        System.out.println(isimler);//[Cansu, Asuman, Hamza]
        isimler.add("Ali");
        System.out.println(isimler.remove(0));//Cansu
      System.out.println(isimler);//[Asuman, Hamza, Ali]







    }



}
