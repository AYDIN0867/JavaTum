package ders11_Switch_Case;

import java.util.Scanner;

public class C03_HaftaIcihaftaSonuDigerCozum {

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
                case "salı":// gunIsmi==salı olduğunda çalışacak kod
                case "carsamba":
                case "persembe":
                case "cuma":

                System.out.println("haftaiçi");
                break;

                case "cumartesi":
                case "pazar":

                System.out.println("haftaSonu");
                break;

            default:

                System.out.println("girilen gün ismi hatalı");
// bir switch statement de switch olarak kullanabiliceğimiz varaiablenin data türü ;
                // byte,short,int,char,String olabilir
                // boolean,long,float,double olamaz

        }




























    }
}
