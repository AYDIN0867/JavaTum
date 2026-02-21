package TEKRAR.Konu.Konu08_IfCumleleri;

import java.util.Scanner;

public class C08_BaginsizIfStatementsFlagYontemi {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı isteyin
//girilen sayılara göre asagıdaki degerlendirmeleriyazdırın
        //1-sayi1<sayi2 ise "birinci  sayi daha kucuk"
        //2- sayi1 pozitif ise "birinci sayi sıfırdan buyuk"
        //3- sayi2 50 den buyuk ise "ikinci sayı 50 den buyuk"
        //4-sayi2 5 ile bolunrbiliyorsa "ikinci  sayı 5 in tam kati"
        //5- eger konsolde yukarıdakilerin HICBIRI yazdırılmasa
        // "nasıl sayı sectiniz , hicbir sarti sağlamayor" yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen iki tamsayı giriniz");
        int girilenSayi1=scanner.nextInt();
        int girilenSayi2=scanner.nextInt();
        int flag=23;

        if (girilenSayi1<girilenSayi2){

            System.out.println("birinci  sayi daha kucuk");
            flag=42;


        }

        if (girilenSayi1>0){

            System.out.println("birinci sayi sıfırdan buyuk");
            flag=42;

        }

        if (girilenSayi2>50){
            System.out.println("sayi2 50 den büyük");
            flag=42;
        }

        if (girilenSayi2%5==0){
            System.out.println("sayi2 5'e bölünebilen bir sayıdır");
            flag=42;
        }

//eger hicbir if bodys çalışmazsa "sayilar uygun değil yazdirin...."
        if(flag==23){

            System.out.println(" \nsayilar uygun değil yazdirin....");

        }

//bağımsız if cümlelerindeki espiri tek şarta bağlı olarak kodumuz çalışır
        //şartın olmaması durumunda ne olacağını bilmiyoruz...biz bunlara basit if cümleleri de deriz...


    }

    }

