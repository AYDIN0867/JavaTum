package TEKRAR.Konu.Konu08_IfCumleleri;

import java.util.Scanner;

public class C04_SusluParantezKullanimi {
    public static void main(String[] args) {

//Soru 3- Kullanicidan bir sayi alın,
// sayi 3 ile bolunuyorsa uc ile bolunebilen sayi"
// 5 ile bolunebiliyorsa "bes ile bolunebilen sayi" yazdırın


        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz....");

        int sayi=scanner.nextInt();

        if(sayi%3==0){

            System.out.println("sayi 3 e bölünebilir");
        }

       if(sayi%5==0){

           System.out.println("sayi 5 e bolünebilir");

       }

       /*
       if cümlelerinde eger if body de sadece 1 satır kod olacaksa {} kullanılmayabilir...

       ANCAK suslu parantez KULLANILMADIGINDA if body'nin ; e kadar olan kısım kabul edileceği UNUTULMAMALIDIR..

        */



    }
}
