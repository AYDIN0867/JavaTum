package ders18_Nested_For_Loop;

import java.util.Scanner;

public class C03_Nested_For_Loop {

    public static void main(String[] args) {

        // kulanıcıdın satır ve sutun sayısını alıp aşağıdaki şekli çizdirin


        //* * * * *
        //* * * * *
        //* * * * *


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz");
        int satirSayisi=scanner.nextInt();
        System.out.println("lütfen sutun sayısını giriniz");
        int sutunSayısı=scanner.nextInt();

        for (int i = 1; i <=satirSayisi ; i++) {


            for (int j = 0; j <=sutunSayısı; j++) {

                System.out.print("* ");


            }

            System.out.println("");
        }







    }
}
