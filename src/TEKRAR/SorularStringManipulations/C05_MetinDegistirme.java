package TEKRAR.SorularStringManipulations;

import java.util.Scanner;

public class C05_MetinDegistirme {
    public static void main(String[] args) {

//kullanıcıdan bir String alin,
// String in uzunlugu çift sayi ise tam ortasina :) ekleyin,
// String in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin...


        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz...");
        String metin=scanner.nextLine();

        int metinLength=metin.length();

        if (metinLength%2==0){

            System.out.println(metin.substring(0,metinLength/2)
                    +":)"+metin.substring(metinLength/2));

        }else {

            System.out.println(

               metin.substring(0,metinLength/2)+

                    ":("+metin.substring(metinLength/2+1)
                    );
        }





    }
}
