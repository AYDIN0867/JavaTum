package ders07_ıfelse;

import java.util.Scanner;

public class C12_Kucukharfdegisitrme {

    public static void main(String[] args) {

//Soru 5- Kullanicidan bir karakter isteyin,
        //        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //        yoksa girilen karakteri girildigi gibi yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen bir karakter giriniz");
        char harf1=scanner.next().charAt(0);
        System.out.println(harf1-0); // girilen karakterin sayı karşılığını veriri matematiksel işlem yaptığımız için

if (harf1>='a'&&harf1<='z'){

    System.out.println((char) (harf1-32));
}else {

    System.out.println(harf1);
}



    }
}
