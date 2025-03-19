package ders23_doWhileLoop;

public class C01_DoWhileLoop {

    public static void main(String[] args) {

// 1 den 5 e kadar olan sayıları yazdırın

        int sayi=1;

        while (sayi<5){

            System.out.println(sayi+" ");
            sayi++;
        }

        System.out.println("");

        //aynısını do while loop ile yaptığımızda //kontrol sayısı daha az

        sayi=1;

        do {
            System.out.println(sayi+" ");
            sayi++;
        }while (sayi<5);


    }
}
