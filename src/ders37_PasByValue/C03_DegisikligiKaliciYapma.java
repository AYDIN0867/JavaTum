package ders37_PasByValue;

import java.util.Scanner;

public class C03_DegisikligiKaliciYapma {

    public static void main(String[] args) {

        // verilen bir cümlede , sadecec ilk harf buyuk geriye kalan tum harfleri kucuk yapıp
        // sonunda .(nokta) yoksa nokta koyup bize donduren bir method oluşturun


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cumle=scanner.nextLine();



        cumle=ilkharfiBuyukYap(cumle);
        System.out.println("main method cumlenin son hali  :"+ cumle);




    }

    public static String ilkharfiBuyukYap(String cumle) {

        cumle=cumle.substring(0,1).toUpperCase()+cumle.substring(1);
        if (cumle.charAt(cumle.length()-1)!='.'){
            cumle+=".";


        }

        return cumle;

    }
}
