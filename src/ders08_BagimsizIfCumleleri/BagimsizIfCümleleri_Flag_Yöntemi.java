package ders08_BagimsizIfCumleleri;

import java.util.Scanner;

public class BagimsizIfCümleleri_Flag_Yöntemi {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen iki tamsayı giriniz");
        System.out.print("birinci tamsayı :");
        int sayi1= scanner.nextInt();
        System.out.print("ikinci tamsayıyı giriniz :");
        int sayi2=scanner.nextInt();
         int flag=23;

        // sayi1<sayi2 ise "birinci sayi daha kuçuk"
        if (sayi1<sayi2){
            System.out.println("birinci sayi daha kuçuk");//birinci sayi daha kuçuk
            flag=42;

        }
        // sayi1 pozitif ise "birinci sayi sifirdan buyuk"

        if (sayi1>0){

            System.out.println("birinci sayi sifirdan buyuk");
            flag=42;

        }

        //sayi2 50 den büyk ise "ikinci sayi 50 den büyük"

        if (sayi2>50){

            System.out.println( "ikinci sayi 50 den büyük");

            flag=42;

        }

        //sayi2 5 ile bölünüyorsa "ikinci sayı 5 in tam kati"
        if (sayi2%5==0){

            System.out.println("ikinci sayı 5 in tam kati");
            flag=42;
        }

       // sona gelindiğinde flag için flag ya 23 dür yada 42 dir 23 ise kaç olması önemlideğil
// eger hicbir if body si calışmadıysa sayıalr uygun değil yazdırın

if (flag==23){

    System.out.println("sayılar uygun değil");
}





    }
}
