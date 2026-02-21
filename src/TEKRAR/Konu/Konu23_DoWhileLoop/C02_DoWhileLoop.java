package TEKRAR.Konu.Konu23_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        //Kullanıcıdan toplamak uzere pozitif tamsayılar isteyin
        // Kullanıcıya bitirmek istediginde 0 a basmasını soyleyin
        //Kullanıcı bitirmek istediğinde toplam kac adet pozitif tamsayı ve bunların toplamının
        // kac oldugunu yazdırın
        // Kullanıcı negatif sayi girerse negatif sayı kullanamazsınız yazdırın
        // bu negatif sayiyi, sayi adedine ve toplamına eklemeyin


        Scanner scanner = new Scanner(System.in);
        int girilenSayi = 0;
        int sayacGirilenPozitifTamsayı = 0;
        int grilenSayiToplamı = 0;

        while (girilenSayi != 0) {
            System.out.println("lütfen pozitif bir tamsayı giriniz...." +
                    "\nBitirmek icin O a basınız..."
            );
            girilenSayi = scanner.nextInt();
            if (girilenSayi > 0) {
                grilenSayiToplamı += girilenSayi;
                sayacGirilenPozitifTamsayı++;

            } else if (girilenSayi < 0) {
                System.out.println("negatif sayı giremezsinizz.....");
            }


        }

        System.out.println("girilen sayıların toplamı :" + grilenSayiToplamı);
// yukarıdaki while lopp ile yaptıgımızı do while loop ile yaptık...


        do {
            System.out.println("lütfen pozitif bir tamsayı giriniz...." +
                    "\nBitirmek icin O a basınız..."
            );
            girilenSayi = scanner.nextInt();
            if (girilenSayi > 0) {
                grilenSayiToplamı += girilenSayi;
                sayacGirilenPozitifTamsayı++;

            } else if (girilenSayi < 0) {

                System.out.println("negatif sayı giremezsinizz.....");
            }

        } while (girilenSayi !=0);

            System.out.println("girilen sayıların toplamı :" + grilenSayiToplamı);

        }

               // while loop un en buyuk eksisi kullanıcıdan  deger alınan gorevlerde loop
    // calısmadan once kod yazan kisinin atayacagı degerin ONEMLI olmasıdır....
    //cunku kodda ilk deger atamasında yanlıs olursa loop body si hiç çalışmaya bilir...
    //kullanıcıdan mutlaka bir deger alınması planlanıyorsa do while loop daha eyidir...
    }






