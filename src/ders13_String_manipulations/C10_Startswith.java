package ders13_String_manipulations;

public class C10_Startswith {

    public static void main(String[] args) {

        String str="Java çok güzel ";

        //str Java ile mi basliyor

        System.out.println(str.startsWith("java"));//false
        System.out.println(str.startsWith("Java"));//true
        System.out.println(str.startsWith("J"));//true
        System.out.println(str.startsWith("Java çok"));//true
        System.out.println(str.startsWith("a"));//false
        System.out.println(str.startsWith("Java çok güzel"));//true


        //5.indeks ve sonrası çok ile mi başlıyor

        System.out.println(str.startsWith("cok",5));//flase
        System.out.println(str.startsWith("çok",5));//true
        //8.indeks ve sonrası
        System.out.println(str.startsWith(" ",8));//true










    }
}
