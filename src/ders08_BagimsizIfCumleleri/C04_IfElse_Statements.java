package ders08_BagimsizIfCumleleri;

import java.util.Scanner;

public class C04_IfElse_Statements {

    public static void main(String[] args) {

        // kenar uzunluklarını alın
        // uzunlula esşitse eşkenar üçgen yazın
        // değilse "eşkenar değil yazdırın
//(soruda biz kenar uzunluklarının pozitif olması gerektiğini görmeliyiz)

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz");
        double kenar1=scanner.nextDouble();
        double kenar2=scanner.nextDouble();
        double kenar3=scanner.nextDouble();


        if (kenar1==kenar2&&kenar1==kenar3&&kenar1>0){

            System.out.println("eşkenar üçgen");
        } else {

            System.out.println("eşkenar değil");

        }


    }
}
