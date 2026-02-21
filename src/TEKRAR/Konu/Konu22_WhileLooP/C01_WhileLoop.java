package TEKRAR.Konu.Konu22_WhileLooP;

public class C01_WhileLoop {
    public static void main(String[] args) {

        //for loop a kadar avantajlı oldugu yer giriş işlerminin bilinmediği
        //durumlarda kullanılır..
        // adım sayısı belli eğilse while loop kullanılır..

        //1 den 10 a kadar sayıların toplamını bulunuz...1 ve 10 sayıları dahil...

        int toplam=0;
        for (int i = 1; i <=10 ; i++) {
        toplam+=i;
        }

        System.out.println("for loop ile sonuc : "+toplam);

  //aynı soruyu   while loop ile yapalım...


  int sayi=1;
  toplam=0;
  while (sayi<=10){

      toplam+=sayi;
      sayi++;

  }


        System.out.println("while loop ile sonu : "+ toplam);
  // 20 den 30 a kadar olan sayiları (20 ve 30 dahil) carpin ve yazdirin


        long carpim=1;

        for (int i = 20; i <=30 ; i++) {

            carpim+=carpim*i;


        }

        System.out.println("carpim :"+ carpim);

        sayi=20;
        carpim=1;

    while (sayi<=30){

        carpim+=carpim*sayi;
        sayi++;

    }

        System.out.println("while loop ile sonu : "+ carpim);


    }






}
