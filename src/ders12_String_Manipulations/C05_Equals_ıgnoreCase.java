package ders12_String_Manipulations;

public class C05_Equals_ıgnoreCase {
    public static void main(String[] args) {



        String str4 = "Not";
        String str5 = "NOT";
        String str6 = new String("not");
        String str7 = "No" + "T";
        String s= "No";
        String t = "T";
        String str8 = s + t ;
        String k = "n";
        String str9 = k.toUpperCase() + "ot";


        System.out.println(str4.equalsIgnoreCase(str5));//TRUE
        System.out.println(str4.equalsIgnoreCase(str6));//TRUE
        System.out.println(str4.equalsIgnoreCase(str7));//true
        System.out.println(str4.equalsIgnoreCase(str8));//true
        System.out.println(str4.equalsIgnoreCase("Not "));//false
    }
}
