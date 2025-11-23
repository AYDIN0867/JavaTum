package TEKRAR.Konu18_ForLoop;

public class C01_BasitDonguler {
    public static void main(String[] args) {

        // 1 denbaslayıp, 50 ye kadar (50 dahil) TEK sayilari yazidiri



        for (int i = 1; i<=50 ; i++) {

           if (i%2!=0){

               System.out.print(i+" ");
           }

        }

  //207 den başlayıp 5 artırak , 400 den kucuk olan sayıları yazdırın

        System.out.println(" ");


        for (int i = 207; i <400 ; i+=5) {

            System.out.print(i+ " ");
        }


        System.out.println("");
// 2 basamaklı cift sayiların toplamı kactır...

        int toplam=0;
        for (int i = 10; i <99 ; i+=2) {

     toplam+=i;
     toplam=+toplam;
        }

        System.out.print(toplam);


        System.out.println(" ");
// 40 sayisini kalansız bölebilen pozitif tamsayilari yazdirin...

        for (int i = 1; i <=40 ; i++) {

            if (40 % i == 0) {

                System.out.print(i + " ");
            }
//1000 den geriye doğru 3 basamklı 37 ile bölünebilen sayiları yazdırın
        }
            System.out.println(" ");

            for (int j = 1000; j >=100 ; j--) {

                if (j%37==0){

                    System.out.print(j+" ");
                }

            }

        System.out.println(" ");
//verilen baslangıc ve bitis degerleri dahil olmak üzere
// bu sayilar arasinda 7 ile bölünebilen sayi adedini yazınız....


int baslangic=235;
int bitis=1673;
int sayac=0;


        for (int i = baslangic; i <=bitis ; i++) {

            if (i%7==0){

                sayac++;
            }

        }System.out.println(sayac);//206




        }

    }

