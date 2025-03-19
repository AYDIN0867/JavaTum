package ders12_String_Manipulations;

public class C02_String_Manipulations_Charat {

    public static void main(String[] args) {

        String str="Java Candir";

        // str ilk harfini yazdırın

        System.out.println(str.charAt(0));//J
        System.out.println(str.charAt(2));//v
        System.out.println(str.charAt(10));//r
        //System.out.println(str.charAt(11));//The call to 'charAt' always fails as an argument is out of bounds ...
        //System.out.println(str.charAt(20)); StringIndexOutOfBoundsException


// str ın sondan üçüncü karakterini yazdırın
// istenen 8. karakter olur java candir e göre

        System.out.println(str.charAt(8));
        // str ın karakter sayısının 11 olduğu biliniyorsa
        // str ın son karakterini yazdırın

        System.out.println(str.charAt(11-1));//r

        // str ın karakter sayısının 11 olduğu biliniyorsa
        // str ın son karakterini yazdırın

        System.out.println(str.charAt(11-5));
    }
}
