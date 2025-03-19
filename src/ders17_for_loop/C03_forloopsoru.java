package ders17_for_loop;

import java.util.Scanner;

public class C03_forloopsoru {

    public static void main(String[] args) {


//Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen başlangıç degeri olarak pozitif bir tam sayı giriniz");
        int baslangic=scanner.nextInt();
        System.out.println("lütfen bitiş degeri olarak pozitif bir tam sayı giriniz");
        int bitis=scanner.nextInt();

        int toplam=0;

        if (bitis<baslangic){

            System.out.println("bitiş degeri başlangıc değerinden büyük olmalıdır");
        }else {

            for (int i = baslangic; i <=bitis ; i++) {

                toplam+=i;

            }

            System.out.println("verilen değerlerin toplamı"+toplam);

        }














    }
}
