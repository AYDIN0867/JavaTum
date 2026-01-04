package TEKRAR.Konu30_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C04_SayıBulmacaOyunu {
    public static void main(String[] args) {

  // 0 ile 100 arasında rastgele bir sayı oluşturun...
  // Kullanıcılardan herkesin bir sayı tahmin etmesini isteyin
  // girilen sayıları bir liste olarak kaydedin
  // Kullanıcılar negatif bir sayı girdiginde
  // olusturulan rastgele sayıyı
  // yapılan tahminleri
  //rast gele sayıya en yakın tahmini yazdırın


        Random random=new Random();
        int tutulanSayi= random.nextInt(100);

        int girilenSayi=0;
        List<Integer> tahminlerListesi=new ArrayList<>();

        Scanner scanner=new Scanner(System.in);

        do {

            System.out.println("lütfen tahmin ettiğiniz pozitif tamsayıyı" +
                    " giriniz...\nsonucu görmek icin negatif sayı giriniz");

            girilenSayi=scanner.nextInt();

            if (girilenSayi>=0){

                tahminlerListesi.add(girilenSayi);
            }

        }while (girilenSayi>=0);

        System.out.println("tuttugum sayı : "+ tutulanSayi);

        System.out.println("yapılan tahminler listesi : "+tahminlerListesi);


        int tutulanSayiyaEnYakinTahmin=tahminlerListesi.get(0);
        int enYakınTahmininSayıİleFarki;

        if (tutulanSayiyaEnYakinTahmin>tutulanSayi){

            enYakınTahmininSayıİleFarki=tutulanSayiyaEnYakinTahmin-tutulanSayi;
        }else {

            enYakınTahmininSayıİleFarki=tutulanSayi-tutulanSayiyaEnYakinTahmin;
        }


for(int each:tahminlerListesi){

    int fark;

    if (tutulanSayiyaEnYakinTahmin>tutulanSayi){

       fark=each-tutulanSayi;

    }else {

       fark=tutulanSayi-each;
    }

    if (fark<enYakınTahmininSayıİleFarki){
        tutulanSayiyaEnYakinTahmin=each;
    }
}


        System.out.println("en yakın tahmin" + tutulanSayiyaEnYakinTahmin);
    }
}
