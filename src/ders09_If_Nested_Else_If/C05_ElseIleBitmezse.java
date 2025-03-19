package ders09_If_Nested_Else_If;

import java.util.Scanner;

public class C05_ElseIleBitmezse {
    public static void main(String[] args) {

        // EGER if else if .... statement
        // else ile bitmiyorsa, bu if else tum durumları kapsamaz  yani degerler için hicbir if bodys çalışmaz


        // kullanıcıdan pozitif bir tamsayı alın
        // sayi hem 3 e hem 5 e bölünüyorsa "super
        //sayi sadece  3 ile bölünüyorsa "3 ün katı"
        //sayi sadece 5 ile bölünüyorsa "5 in katı"



        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen pozitif bir sayı giriniz :");
        int girilenSayi=scanner.nextInt();

        if (girilenSayi%3==0&&girilenSayi%5==0){

            System.out.println("super");
        } else if (girilenSayi%3==0) {

            System.out.println("3 ün katı");

        } else if (girilenSayi%5==0) {

            System.out.println("5 in katı");

        }
// if else ler illa else ile bitmek zorunda olmaya bilir ama şartların sağlanmadığı
// input yapılırsa if body si hiç bir sonuç vermez

    }
}
