package ders13_String_manipulations;

public class C04_Equals {

    public static void main(String[] args) {

    String str1="Ali";
    String str2="ALI";
    String str3="ali";
    String str4="Ali ";
    String str5="Ali";

    // METİNLER ŞİMDİLİK EQUALS KULLANILIR


        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equals(str3));//false
        System.out.println(str1.equals(str4));//false çünkü boşluk var
        System.out.println(str1.equals(str5));//true
        System.out.println(str2.equals(str3));//false


        // eger sade sadece buyuk küçük harf öenmli değil diyorsak equalsigonore ederiz

        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str1.equalsIgnoreCase(str3));//true
        System.out.println(str1.equalsIgnoreCase(str4));//false çünkü boşluk var
        System.out.println(str1.equalsIgnoreCase(str5));//true
        System.out.println(str2.equalsIgnoreCase(str3));//true


    }
}
