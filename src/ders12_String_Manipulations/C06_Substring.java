package ders12_String_Manipulations;

public class C06_Substring {
    public static void main(String[] args) {

     String str="java Candir";

     // metnin bir belirli kısmını alamak için substring kullanılrı

        System.out.println(str.substring(2));//va Candir
        System.out.println(str.substring(0));// java candir
        System.out.println(str.substring(10));// r
        System.out.println(str.substring(11));// boş satır getiriyor çünkü 11 indekste hiçbirşey yok hiçlik var
        //System.out.println(str.substring(12));// shata veiri

// sondan üç karakteri yazırın

        System.out.println(str.substring(8));//dir
        System.out.println(str.substring(str.length()-3));// 8 in indeksini
        // manuel hesaplamak yerine sondan üçüncikarakterin str.length-3 ile bulurz

// sondan 5 karakteri yazırın
        System.out.println(str.substring(str.length()-5));//andir


    }

}
