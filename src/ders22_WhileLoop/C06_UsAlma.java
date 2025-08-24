package ders22_WhileLoop;

public class C06_UsAlma {

    public static void main(String[] args) {


        // verilen bir sayi ve pozitif tamsayı için
        // while loop kullnarak verilen sayının istenen usssunu hesaplayıp yazdıran bir method oluşturun

        usHesaplaYazdir(3,4);
        usHesaplaYazdir(3.4,2);

    }


    public static void usHesaplaYazdir(double sayi,int pozitifüs){
        double sonuc=1;
        while (pozitifüs>0){

            sonuc*=sayi;
            pozitifüs--;
        }

        System.out.println(sonuc);
    }

}
