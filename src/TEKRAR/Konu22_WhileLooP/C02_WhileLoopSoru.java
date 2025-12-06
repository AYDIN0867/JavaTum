package TEKRAR.Konu22_WhileLooP;

public class C02_WhileLoopSoru {
    public static void main(String[] args) {

        //20 ile 30 arasındaki çift sayıların carpımını bulunuz...

        //********************for loop ile*************************

        long toplam=0;

        for (int i = 20; i <=30 ; i++) {

            if (i%2==0){

                toplam+=toplam+i;


            }

        }

        System.out.println("for loop ile toplam "+toplam);

//****************************** While Loop ile çözüm*******************************
        int sayi=20;
        while (sayi<=30){

            if (sayi%2==0){

                toplam+=toplam+sayi;
                sayi++;



            }

            System.out.println("while loop ile sonuc "+ toplam);
        }





    }
}
