package ders16_For_Loop;

import java.util.Scanner;

public class C04_AradakiSayılarınToplamı {
    public static void main(String[] args) {


        //kullanıcıdan baslangıc ve bitis degeri olarak pozitif sayıları alın
        //sınırlar dahil olarak aralarındaki tum sayıların toplamını yazdırın
        //bitiş degeri baslangıc degerinden kucuk olsa da,program çalıssın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen pozitif bir baslangıc dgeri giriniz");
        int baslangic=scanner.nextInt();
        System.out.println("lütfen pozitif bir bitis degeri giriniz");
        int bitis=scanner.nextInt();
        int toplam=0;

    if (baslangic<bitis){

        for (int i = baslangic; i <=bitis ; i++) {

            toplam+=i;



        }
    }



    else {

        for (int i = baslangic; i <=bitis; i--) {

            toplam+=i;


        }
    }
        System.out.println(toplam);



    }
}
