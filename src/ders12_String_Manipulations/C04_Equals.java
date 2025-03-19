package ders12_String_Manipulations;

public class C04_Equals {

    public static void main(String[] args) {



        char chr1='a';
        char chr2='b';

        // chr 1 ve chr2 eşitse aynı karakter değilse farklı karakter yazduırın

        if (chr1==chr2){

            System.out.println("ayni karakter");
        }else{

            System.out.println("farkli karakter");
        }









        String str1="ali";
        String str2="ali";
        String str3=new String("ali");


/* stringlerde metinleri karşılaşrırmak istediğimizden genelikkle  == dir kullanmayız

çünkü == hem metin değeri hem de referansa bakar ve metinler
 birebir aynı olsa da bazen true bazen false verir

 */


        if (str1==str1){

            System.out.println("ayni metin");
        }else{

            System.out.println("farkli metin");
        }


        String str4 = "Not";
        String str5 = "Not";
        String str6 = new String("Not");
        String str7 = "No" + "t";
        String s= "No";
        String t = "t";
        String str8 = s + t ;
        String k = "n";
        String str9 = k.toUpperCase() + "ot";

        System.out.println(str4==str5);//true
        System.out.println(str4==str6);//false
        System.out.println(str4==str7);//true
        System.out.println(str4==str8);//false
        System.out.println(str4==str9);//false

        System.out.println("================================");

        System.out.println(str4.equals(str5));//true
        System.out.println(str4.equals(str6));//true
        System.out.println(str4.equals(str7));//true
        System.out.println(str4.equals(str8));//true
        System.out.println(str4.equals(str9));//true
        System.out.println(str4.equals("Not"));//true

// equals sadece metne odaklanır metin birevbir aynı ise
// true verir karakter farklılığı varsa false olur


        System.out.println("=================================");
        System.out.println(str4.equals("Not"));//false
        System.out.println(str4.equals("NOT"));//false
        System.out.println(str4.equals("Not "));//false













    }






}
