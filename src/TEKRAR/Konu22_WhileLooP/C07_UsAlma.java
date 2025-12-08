package TEKRAR.Konu22_WhileLooP;

import java.util.Scanner;

public class C07_UsAlma {
    public static void main(String[] args) {

        // Soru 5- Verilen bir sayi ve pozitif tamsayı us icin
        // While loop kullanarak verilen sayinin istenen ussunu hesaplayıp yazdıran
        // bir metod oluşturun...












       usAll(3,2);
       usAll(3,3);

       double sayımıBuldum=usAll(3,2);
        System.out.println(sayımıBuldum);

    }

    public static double usAll(int sayi,int pozitifUs){

        double sonuc=1;
        while (pozitifUs>0){

            sonuc*=sayi;
            pozitifUs--;


        }

return sonuc;
    }
}
