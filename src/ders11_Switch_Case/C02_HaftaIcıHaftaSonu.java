package ders11_Switch_Case;

import java.util.Scanner;

public class C02_HaftaIcıHaftaSonu {

    public static void main(String[] args) {
// kullanıcıdan gün ismi alın
        // buyuk kucuk harf fark etmez
        //girilen gunun hafta içi veya hafta sonu olduğunu yazdırın
        // kullanıcı gun ismini yanlıs yazarsa uyarın



        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen gün ismini giriniz");
        String gunIsmi=scanner.nextLine().toLowerCase();


        switch (gunIsmi){

            case "pazartesi":  //gunIsmi==pazartesi olduğunda çalışacak kod

                System.out.println("haftaiçi");
                break;

            case "salı":// gunIsmi==salı olduğunda çalışacak kod

                System.out.println("haftaiçi");
                break;
            case "carsamba":

                System.out.println("haftaiçi");
                break;
            case "persembe":

                System.out.println("haftaiçi");
                break;
            case "cuma":

                System.out.println("haftaiçi");
                break;

            case "cumartesi":

                System.out.println("haftaSonu");
                break;
            case "pazar":

                System.out.println("haftaSonu");
                break;

            default:

                System.out.println("girilen gün ismi hatalı");


        }





    }
}
