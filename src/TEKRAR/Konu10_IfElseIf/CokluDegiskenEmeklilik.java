package TEKRAR.Konu10_IfElseIf;

import java.util.Scanner;

public class CokluDegiskenEmeklilik {
    public static void main(String[] args) {

        //Kullanıcıdan cinsiyetini ve yasını alın
        //Kadin,60 yas ve üzeri,Erkek 65 yas ve üzeri emekli olabilir
        //Cinsiyet ve yasini dikkate alarak "Emekli Olabilirsin"
        //veya "Emekli olamak için ... Yıldaha çalışman gerek" yazdırn
        //kulanıcı E veya K disinda bir cinsiyet girerse
        //veya 15 yasdan kucuk ve 80 yasdan buyuk yas girerse uyarın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayı giriniz");
        int sayi = scanner.nextInt();

        System.out.println("lütfen cinsiyetiniz Erkek için E kadınlar için K diye belirtin");
        char cinsiyet=scanner.next().toUpperCase().charAt(0);

        if(!(cinsiyet=='K'||cinsiyet=='E')||sayi<15||sayi>80){
            System.out.println("girdiginiz veriler için emeklilik durumu hesaplananamz");
        } else if (cinsiyet=='K'&&sayi>=60) {
            System.out.println("emekli olabilirsiniz");
        } else if (cinsiyet=='K'&& sayi<60){
            System.out.println(60-sayi +" yıl sonra emekli olabileceksiniz");
        } else if (cinsiyet=='E'&& sayi>=65) {
            System.out.println("emekli olabilrsiniz");
        } else if (cinsiyet=='E') {
            System.out.println(65-sayi + " yıl sonra emekli olabilirsiniz");
        }



    }
}
