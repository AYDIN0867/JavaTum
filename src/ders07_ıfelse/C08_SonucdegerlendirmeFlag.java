package ders07_ıfelse;

import java.util.Scanner;

public class C08_SonucdegerlendirmeFlag {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen tamsayı giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int flag=0;
        // 1- sayi1<sayi2 ise  birinci sayı daha küçük yazdırın

        if (sayi1 < sayi2) {
            System.out.println("birinci sayı daha küçük");
            flag=1;
        }

        if (sayi1 > 0) {

            System.out.println("birinci sayı sıfırdan büyük");
            flag=1;

        }

        if (sayi2 > 50) {

            System.out.println("ikinci sayı 50 den büyük");
            flag=1;
        }

      // eger hiç bir if bodysi calışmadıysa ikinci

        // sona gelindiğinde kaç şartın sağlandığı flag yönteminden anlaşılmaz
        // buradda flag 0 yada 1 olur flag 0 ise ==> hiçbir şartın sağlanamadığınız anlarız
        //flag 1 ise bazı şarların sağladığını gösterir


        if (flag==0){

            System.out.println("sayılar uygun değil");

        }
    }
}
