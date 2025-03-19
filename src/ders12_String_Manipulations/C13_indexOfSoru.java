package ders12_String_Manipulations;

import java.util.Scanner;

public class C13_indexOfSoru {
    public static void main(String[] args) {

        // kullanıcıdan içinde en az 3 tane e olan  bir metin isteyin
        //metindeki 3. e nin indeksini yazdırın


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String girilenMetin=scanner.nextLine();

        int ilkIndeks=girilenMetin.indexOf("e");
        int ikinciIndeks=girilenMetin.indexOf("e",ilkIndeks+1);
        int ucuncuIndeks=girilenMetin.indexOf("e",ikinciIndeks+1);

        System.out.println(ucuncuIndeks);





    }
}
