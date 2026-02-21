package TEKRAR.Konu.Konu19_NestedForLoop;

import java.util.Scanner;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        //Kullanıcıdan satir sayisini alip asagidaki sekli cizdirin...

        /*

        0
        0 1
        0 1 2
        0 1 2 3
        0 1 2 3 4

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen satir sayisini giriniz...");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <=i; j++) {

                System.out.print(j-1+" ");

            }

            System.out.println("");
        }




    }
}
