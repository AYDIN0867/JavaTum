package ders24_ArraysVeTekrarMethod;

public class C08_Kullanımsayısı {

    public static void main(String[] args) {

        //  Verilen bir array’de istenen bir elemanin var olup olmaindigini ve varsa kac kere kullanildigini
        //  yazdiran bir method olusturun.

        int[] arr = {1, 3, 4, 2, 4, 5, 3, 1, 4, 2, 7, 8, 6};
        int arananSayi=2;
        printKullanımSayisi(arr,arananSayi);


    }



    public static void printKullanımSayisi(int[]arr,int istenenEleman){

        int count=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==istenenEleman){

                count++;
            }

        }


        if (count==0){

            System.out.println("aradığınız sayı arryede yok");
        }else System.out.println("aradığınız sayı arreyde "+count+" adet kullanılmıştır");

    }
}