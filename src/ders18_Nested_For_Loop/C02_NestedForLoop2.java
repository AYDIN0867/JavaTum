package ders18_Nested_For_Loop;

import java.util.Scanner;

public class C02_NestedForLoop2 {

    public static void main(String[] args) {

        // kulanıcıdın satır ve sutun sayısını alıp aşağıdaki şekli yazdırın
        // foor loop kullanarak asagıdaki sayıları yazdırın

        //2 3 4 5 6
        //3 4 5 6 7
        //4 5 6 7 8
        //5 6 7 8 9

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz");
        int satirSayisi=scanner.nextInt();
        System.out.println("lütfen sutun sayısını giriniz");
        int sutunSayısı=scanner.nextInt();

        for (int i = 1; i <=satirSayisi ; i++) {

            for (int j = 1; j <=sutunSayısı ; j++) {

                System.out.print(i+j+" ");

            }


            System.out.println("");
        }









    }
}
