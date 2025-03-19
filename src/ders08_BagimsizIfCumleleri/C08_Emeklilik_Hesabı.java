package ders08_BagimsizIfCumleleri;

import java.util.Scanner;

public class C08_Emeklilik_Hesabı {

    public static void main(String[] args) {

     // kullanıcıdan yaşını isteyin
     // 65 yas ve üzeri ise "Emekli olabilirsin" yazdırn
     //yoksa emekli olması için gerekli olan yıl sayısını söyleyin


        Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen yaşınızı giriniz  :");
        double yas=scanner.nextDouble();

        if (yas>=65){

            System.out.println("Emekli olabilirsin");

        }else{
             int kalanYil= (int)(65-yas);
            System.out.println("emekliliğinize "+kalanYil+" yıl var");
        }












    }

}
