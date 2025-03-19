package ders10_Ternary;

import java.util.Scanner;

public class C07_NestedTernary {

    public static void main(String[] args) {

    // kullanıcıdan bir sayı isteyin
    // verielen sayı pozitif ise "pozitif
    // verilen sayı negatif ise "negatif"
    // pozitif veya negatif değilse "notr" yazdırın






        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen  bir tamsayi giriniz");
        int sayi1=scanner.nextInt();


        System.out.println(sayi1>0?"pozitif":sayi1<0?"negatif":"notr");


//sayi tek ise "3 ün katı" veya "3 ün katı değil " yazdırın
        //sayi cift ise "5 in kati değil" yazdırın

        System.out.println(

                sayi1%2==0

                        ?
                        
                        sayi1%5==0?

                        "5 in katı" :"5 in kati değil"


                                :
                sayi1%3==0? "3 ün katı": "3 ün katı değil"


                );


    }
}
