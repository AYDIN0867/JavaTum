package ders23_doWhileLoop;

public class C03_DoWhileLoopVsWhileLoop {
    public static void main(String[] args) {


        // verielen sayıdan
        // baslayıp birer artırarak ,10 a kadar 10 hariç olan sayıları yazdırın

        int sayi=5;

        while (sayi>10){

            System.out.println(sayi+" ");
            sayi++;
        }
        System.out.println("");



        sayi=15;

        do {
            System.out.println(sayi+" ");
            sayi++;
        }while (sayi<10);

//do while loop en az bir defa çalışır ve ilk değeri yazdırır


    }
}
