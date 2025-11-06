package TEKRAR.Konu09_IfElseIf;

import java.util.Scanner;

public class C04_HarfDegistirmeBuyukKucuk {
    public static void main(String[] args) {


        //Kullanıcıdan bir harf isteyin
        // harf kucuk ise BUYUK
        //harf buyuk ise KUCUK yazdırın


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char harf=scanner.next().charAt(0);

        if (harf>='a'&&harf<='z'){

            System.out.println((char)harf-32);
        }else System.out.println(harf);



        if (Character.isLowerCase(harf)){
            System.out.println(Character.toUpperCase(harf));

        }else System.out.println(harf);




    }
}
