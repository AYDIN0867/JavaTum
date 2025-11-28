package TEKRAR.NestedForLoop;

import java.util.Scanner;

public class C03_NestedForLoop {
    public static void main(String[] args) {
         /*

        Kullanıcıdan satir ve sütun sayisini alip asagidaki sekli cizdirin...
        orn satir=4, sütun=5 oldugunda

        * * * * *
        * * * * *
        * * * * *
        * * * * *

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen satir sayisini giriniz...");
        int satir=scanner.nextInt();
        System.out.println("lütfen sütun sayisini giriniz...");
        int sutun=scanner.nextInt();

        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <=sutun ; j++) {

                System.out.print("* ");

            }

            System.out.println("");
        }




    }
}
