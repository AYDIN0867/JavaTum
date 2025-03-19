package ders18_Nested_For_Loop;

import java.util.Scanner;

public class C01_Nested_For_Loop1 {

    public static void main(String[] args) {

        //bir for loop kullanarak 1 2 3 4 yazdırın

        for (int i = 1; i <=4 ; i++) {

            System.out.print(i+" ");

        }

        // bir for loop kullanarak 2 4 6 8 yazdırın..
        System.out.println("");

        for (int i = 1; i <=4 ; i++) {

            System.out.print(i*2+" ");

        }
//bir for loop kullanarak 3 6 9 12 yazdırın..

        for (int i = 1; i <=4 ; i++) {

            System.out.print(i * 3 + " ");
        }



        for (int i = 1; i <=4 ; i++) {

            System.out.print(i * 4 + " ");
        }

        System.out.println("===========================================");

// foor loop kullanarak asagıdaki sayıları yazdırın

        //1 2 3 4
        //2 4 6 8
        //3 6 9 12
        // 4 8 12 16

        for (int i = 1; i <=4 ; i++) {

            for (int j = 1; j <=4 ; j++) {


                System.out.print(i*j+" ");

            }


            System.out.println("");
        }


















    }

}
