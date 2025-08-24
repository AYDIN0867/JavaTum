package ders17_For_loop;

import java.util.Scanner;

public class C04_foorloopSayilarıntoplamını {

    public static void main(String[] args) {

//  Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //  sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //  Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen başlangıç degeri olarak pozitif bir tam sayı giriniz");
        int baslangic=scanner.nextInt();
        System.out.println("lütfen bitiş degeri olarak pozitif bir tam sayı giriniz");
        int bitis=scanner.nextInt();

        int toplam=0;

        if (bitis>=baslangic){

            for (int i = baslangic; i <=bitis ; i++) {

                toplam+=i;

            }

            System.out.println("verilen değerlerin toplamı"+toplam);



        }else {

            for (int i = bitis; i <=baslangic ; i++) {

                toplam+=i;

            }

            System.out.println("verilen değerlerin toplamı"+toplam);


        }





    }
}
