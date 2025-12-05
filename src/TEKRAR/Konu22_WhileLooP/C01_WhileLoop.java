package TEKRAR.Konu22_WhileLooP;

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

        System.out.println(toplam);

  //aynı soruyu   while loop ile yapalım...


  int sayi=1;
  toplam=0;
  while (sayi<=10){

      toplam+=sayi;
      sayi++;

  }



    }
}
