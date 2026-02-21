package TEKRAR.Konu.Konu23_DoWhileLoop;

public class C03_WhileLoopDoWhileLoop {
    public static void main(String[] args) {

        //verilen sayıdan baslayarak, 1O a kadar (10 haric) olan sayiları yazdırın...

        int sayi=5;

        while (sayi<=10){

            System.out.print(sayi+ " ");
            sayi++;

        }


        //do while loop ile

        sayi=5;
        do {

            System.out.print(sayi+ " ");

        }while (sayi<=10);

            System.out.println(sayi+" ");
            sayi++;
        }

    }

