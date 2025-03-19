package ders07_ıfelse;

import java.util.Scanner;

public class C10_Dergecme {
    public static void main(String[] args) {



        //Soru 2- Kullanicidan 2 vize bir final notunu alin final%60 vize ortalaması
        // %40 olacak şekilde yılsonu notunu bulun
        //        50 veya daha buyukse ”Sinifi Gectin”,
        //        50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen notunuzu girinşiz");
        System.out.print("1. vize :");
        double vize1 = scanner.nextDouble();
        System.out.print("2.vize :");
        double vize2 = scanner.nextDouble();
        System.out.print("final :");
        double finalnotu = scanner.nextDouble();
        double vizeortalama=(vize2+vize1)/2;
        double dersortalama=(vizeortalama*0.40+finalnotu*0.60);

        if (dersortalama>=50){

            System.out.println("tebrikler geçtin");
        }else {

            System.out.println("ne yazıkkı çakıldın..."+dersortalama+"olduğu için kaldınız");
        }




    }


}
