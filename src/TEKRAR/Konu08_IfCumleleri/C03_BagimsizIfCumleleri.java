package TEKRAR.Konu08_IfCumleleri;

import java.util.Scanner;

public class C03_BagimsizIfCumleleri {
    public static void main(String[] args) {

//Kullanıcıdan iki tam sayı isteyin


//girilen sayi1 ve sayi2 icin asagidaki sartlari kontrol edin
//ve hic bir sartı sağlamıyorsa " sayilar uygun değil " yazdırın
//eger sayilar tum sartları saglarsa " sayılar mukemmel" yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen iki tamsayı giriniz :");


        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int sayac = 10;

        //1-- sayi1 < sayi2 olmalıdır

        if (sayi1 < sayi2) {
            sayac++;
        }

        //2-- sayi1 pozitif olmalıdır

        if (sayi1 >= 0) {

            sayac++;
        }

        //3-- sayi2 50 den büyük olmalıdır

        if (sayi2 > 50) {

            sayac++;
        }

        //4- sayi2 5 ile bölünebilmelidir

        if (sayi2 % 5 == 0) {

            sayac++;
        }

        if (sayac == 14) {

            System.out.println(" sectiğiniz sayılar mukemmeldir....");

        }else System.out.println("sayilar uygun değil ....");



    }
}