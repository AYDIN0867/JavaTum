package TEKRAR.Konu08_IfCumleleri;

import java.util.Scanner;

public class C01_SınıfGecme {
    public static void main(String[] args) {
        //kullanıcıdan notunu alın
        //notu 50veya buyukse "sinifi gectin" yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz....");
        double girilenNot=scanner.nextDouble();

//        if(girilenNot==50||girilenNot>50){
//
//            System.out.println("sınıfı gectiniz....");
//        }

        if(girilenNot>=50){

          System.out.println("sınıfı gectiniz....");
      }

int a=20;
int b=25;

if(a>b){

    System.out.println("a sayısı b den buyuk");
}

if(a<100){

    System.out.println("a sayısı 100 den kucuk");

}


if(b<0){

    System.out.println("b 0 dan buyuk");


}


    }
}
