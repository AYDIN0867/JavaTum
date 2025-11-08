package TEKRAR.Konu10_IfElseIf;

import java.util.Scanner;

public class C05_ElseIleBitmezse {
    public static void main(String[] args) {

        /*
        EGER bir else if ....statement else ile bitmiyorsa
        , bu if-else tum durumları KAPSAYAMAZ
        yani bazi degerler icin hicbir if bodys 'i çalışmaz
         */

  //Kullanıcıdan pozitif bir tamsayı isteyin
  // sayi hem 3 hem 5 e bölünüyorsa "SUPER"
  // sayi sadece 3 ile bolunuyorsa 3 un kati
  // sayi sadece 5 ile bolunuyorsa 5 in katı yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayı giriniz");
        int sayi = scanner.nextInt();

if(sayi%3==0&&sayi%5==0){
    System.out.println("SUPER");
} else if (sayi%3==0) {
    System.out.println("3 ün katı");
} else if (sayi%5==0) {
    System.out.println("5 in katı");
}


    }
}
