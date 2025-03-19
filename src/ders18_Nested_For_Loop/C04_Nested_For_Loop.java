package ders18_Nested_For_Loop;

import java.util.Scanner;

public class C04_Nested_For_Loop {
    public static void main(String[] args) {

      //kullanıcıdan satır sayısını alıp yazdırın



        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz");
        int satirSayisi=scanner.nextInt();

        for (int i = 0; i <=satirSayisi ; i++) {

            for (int j = 0; j <=i ; j++) {

                System.out.print("* ");


            }

            System.out.println("");

        }



    }
}
