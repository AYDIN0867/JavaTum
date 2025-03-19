package ders15_String_Manipulations;

public class C05_ReplaceAll {
    public static void main(String[] args) {

        String str="Ali okula gitti, 3 saat sonra gelecek";

        // tum t'leri T yazın

       // System.out.println(str.replace("t", "T"));
        System.out.println(str.replace("t","T"));
        System.out.println(str.replace("3","2"));
        System.out.println(str.replace('t','T'));
        System.out.println(str.replaceAll("o","O"));// replaceAll un
        // kullanım amacı regexleri kullanamktır


        str="Kredi karti numaram 1234 3456 3421 6754";
        //tum sayıları * yapın

        System.out.println(str.replaceAll("\\d", "*"));

        str="ali mert SAHİN";
        //str'i ilk harf buyuk harf, kalan tum harfleri * olacak şekilde değiştirin
        System.out.println(
                str.substring(0,1).toUpperCase()+
                        str.substring(1).toLowerCase().replaceAll("\\w","*")



        );






    }
}
