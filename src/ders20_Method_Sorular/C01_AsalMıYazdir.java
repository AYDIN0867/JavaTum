package ders20_Method_Sorular;

public class C01_AsalMıYazdir {

    public static void main(String[] args) {

    //verilen bir tam sayının,
    // asal sayı olup olmadığını kontrol edip,sonucu yazdıran bir metod oluşturun

asalMıYazdir(30);
asalMıYazdir(43);
    }

    public static void asalMıYazdir(int sayi){

        for (int i = 2; i<sayi ; i++) {

            if (sayi%i==0){

                System.out.println("asal değil");
                break;
            }

            if (i==sayi-1){

                System.out.println("asaldır");
            }



        }








    }





}
