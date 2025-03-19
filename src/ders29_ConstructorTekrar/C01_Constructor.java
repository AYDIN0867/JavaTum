package ders29_ConstructorTekrar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_Constructor {
    public static void main(String[] args) {


        String str="java candir";

        List<Integer>sayilar=new ArrayList<>();

        Scanner scanner=new Scanner(System.in);

        Random random=new Random(); //Random() burda constructor

        /*

       obje varsa mutlaka classdan oluşturulmuştur...

        bir classdan kulanılabilir bir obje oluşturmak için constructor çalışmalıdır.

         */

        System.out.println(sayilar.size());//0



    }


}
