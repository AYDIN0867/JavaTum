package TEKRAR.Konu17_SorularStringManipulations;

import java.util.Scanner;

public class C06_IsimDuzenleme {
    public static void main(String[] args) {

//kullanıcıdan ismini alın
// Kullanıcı 3 isimli olsa da
// isimlerin ilk harfi buyuk harf, kalanlar * olacak şekilde yazdırın
// Ornek ınput: ali mert can
          //output :A** M*** C**

  Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen isminiz giriniz.....");
        String isim=scanner.nextLine();



        int ilkSpaceIndex=isim.indexOf(" ");
        int ikinciSpaceIndex=isim.indexOf(" ",ilkSpaceIndex+1);

        System.out.println(

                isim.substring(0,1).toUpperCase()
                        +isim.substring(1,ilkSpaceIndex).replaceAll("\\w","*")
                        +" "

                        +isim.substring(ilkSpaceIndex+1,ilkSpaceIndex+2).toUpperCase()
                        +isim.substring(ilkSpaceIndex+2,ikinciSpaceIndex).replaceAll("\\w","*")
                        +" "
                        +isim.substring(ikinciSpaceIndex+1,ikinciSpaceIndex+2).toUpperCase()
                        +isim.substring(ikinciSpaceIndex+2).replaceAll("\\w","*")


        );





    }
}






