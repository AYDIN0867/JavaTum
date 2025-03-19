package ders10_Ternary;

public class C06_TernaryAtamaYazdirma {

    public static void main(String[] args) {

        // ternary operatoru YA sout icinde kullanılmali
        // YA DA mutlaka atama yapılmalıdır

        // verilen görevde hem yazdırma hem atama varsa
        // ternary yazarken dikkat edilemlidir


        int sayi=20;

        // verilen sayı variablenin değerini kontrol edip
        // sayi çiftse "çift sayıları sevmem" yazdırın
        // sayi tekse sayının değerini 10 artırın


        System.out.println(sayi%2==0?"çift sayıları sevemem":(sayi+=10));



    }
}
