package ders08_BagimsizIfCumleleri;

import java.util.Scanner;

public class BagimsizIfCumleleri_Soru {

    public static void main(String[] args) {

        // girirlen sayılara göre aşağıdaki değerlendirmeleri yazdırın
        // sayi1<sayi ise "birinci sayi daha kuçuk"
        // sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        //sayi2 50 den büyk ise "ikinci sayi 50 den büyük"
        //sayi2 5 ile bölünüyorsa "ikinci sayı 5 in tam kati"
        // EGER  konsolda yukarıdakilerden hicbiri yazdırılmazsa
        //" nasıl sayi sectiniz, hicbir sarti saglamıyor" yazdırın

    // kendi notum: burada istenen aşamaların kendi arasındaki bağlantıta bakılır
    // istenenler arasında bağlantı olamadığı tespit edildiği için bağımsız
        // if cümleleri ile kodlama yayıpılır


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen iki tamsayı giriniz");

        int sayi1= scanner.nextInt();
        int sayi2=scanner.nextInt();

        // sayi1<sayi2 ise "birinci sayi daha kuçuk"

        if (sayi1<sayi2){
            System.out.println("birinci sayi daha kuçuk");//birinci sayi daha kuçuk
        }
       // sayi1 pozitif ise "birinci sayi sifirdan buyuk"

        if (sayi1>0){

            System.out.println("birinci sayi sifirdan buyuk");
        }

        //sayi2 50 den büyk ise "ikinci sayi 50 den büyük"

       if (sayi2>50){

           System.out.println( "ikinci sayi 50 den büyük");
       }
        //sayi2 5 ile bölünüyorsa "ikinci sayı 5 in tam kati"
        if (sayi2%5==0){

            System.out.println("ikinci sayı 5 in tam kati");

        }

        // EGER  konsolda yukarıdakilerden hicbiri yazdırılmazsa
        //" nasıl sayi sectiniz, hicbir sarti saglamıyor" yazdırın

     //1. yöntem ;eger mümkünse ilk dört şartın aksi durumlarını tek bir if ile yazabiliriz


        if (!(sayi1<sayi2)&& !(sayi1>0)&&!(sayi2>50)&&!(sayi2%5==0)){

            System.out.println("nasıl sayi sectiniz, hicbir sarti saglamıyor");
        }


    }
}
