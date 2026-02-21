package TEKRAR.Konu.Konu19_NestedForLoop;

import java.util.Scanner;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        //Kullanıcıdan satir sayisini alip asagidaki sekli cizdirin...
        //        orn satir=5
        /*

         *
         * *
         * * *
         * * * *
         * * * * *

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen satir sayisini giriniz...");
        int satir = scanner.nextInt();


        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");


            }

            System.out.println("");

        }

    }

}