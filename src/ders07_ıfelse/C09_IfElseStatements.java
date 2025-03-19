package ders07_ıfelse;

import javax.swing.*;
import java.util.Scanner;

public class C09_IfElseStatements {

    public static void main(String[] args) {

    /*
    if else statements yapısında 2 farklı ihtimal vardır
    bu ihitmallerden if ile sorgulalan ihitmal dışındaki tüm sorgulamalar
    else ile ifade edilir..

     */
        // JOptionPane.showConfirmDialog("lütfen üçgenin kenar uzunluklarını giriniz" )
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz");
        System.out.print("1. kenar :");
        double kenar1 = scanner.nextDouble();
        System.out.print("2.kenar :");
        double kenar2 = scanner.nextDouble();
        System.out.print("3. kenar");
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar1 == kenar3) {

            System.out.println("ölçülerini giridğiniz üçgen bir eşkenar üçgendir");

        }else {
            System.out.println("ölçülerini giridğiniz üçgen bir eşkenar üçgendeğildir");

        }


    }
}
