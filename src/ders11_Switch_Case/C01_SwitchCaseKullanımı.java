package ders11_Switch_Case;

import java.util.Scanner;

public class C01_SwitchCaseKullanımı {

    public static void main(String[] args) {

        // kullanıcıya haftanın kacıncı gününü yazdırmak istediğini sorun
        // 1-7 arasındaki degerler için pazartesiden pazara kadar gün isimlerini yazzdırın
        // 1-7 arasındaki sayılaradan farklı bir sayı girerse hata mesajı verin

        /*
        kademeli kullanmak istediğimiz kodlarda kullanır.switch(kontrolEdilecekVariable{}
        java kontrolEdilecekVariablenin degerine uygun olan case den başlar


        ve switch statementin sonuna kadar gider bizde bunu istediğimize
        gore ayarlamak için break kullanırız

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("haftanın kaçıncı gününü yazdırmak istersiniz :");
        int gunNo=scanner.nextInt();

        switch (gunNo){

            case 1:// gunNO==1 olduğunda çalışacak kodlar

                System.out.println("pazartesi");
                break;

            case 2:// gunNo==2 olduğunda çalışacak kod

                System.out.println("salı");
                break;
            case 3:

                System.out.println("çarşamba");
                break;
            case 4:

                System.out.println("perşembe");
                break;
            case 5:

                System.out.println("cuma");
                break;

            case 6:

                System.out.println("cumaertesi");
                break;
            case 7:

                System.out.println("pazar");
                break;

            default:

                System.out.println("girilen gün numrası hatalı");


        }






    }
}
