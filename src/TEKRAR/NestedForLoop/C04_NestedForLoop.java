package TEKRAR.NestedForLoop;

import java.util.Scanner;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        //Kullanıcıdan satir ve sütun sayisini alip asagidaki sekli cizdirin...
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



        for (int i = satir; i <=1; i++) {


            System.out.print("* ");


        }

        System.out.println("");

        for (int i = 2; i <= satir; i++) {


            System.out.print("* ");

        }


        }
        }
