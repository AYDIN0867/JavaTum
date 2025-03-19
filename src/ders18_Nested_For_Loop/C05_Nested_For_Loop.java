package ders18_Nested_For_Loop;

import java.util.Scanner;

public class C05_Nested_For_Loop {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz");
        int satirSayisi=scanner.nextInt();

        for (int i = 0; i <=satirSayisi ; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print(j-1+" ");


            }

            System.out.println("");

        }














    }
}
