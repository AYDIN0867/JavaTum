package ders51_MultipleCheckedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_CheckedExceptions {

    /*

    Exceptions temel olarak 2 ye ayrılır ;
    Run Time da ortaya cikan exceptionlar RunTimeExceptions,UnCheckedExceptions
    StringIndexOutOfBoundsException
    ArrayIndexOutOfBoundsException
    ArithmeticException

    Compile Time sirasında fark edilenler CheckedExceptions

    Bugüne kadar alti kirmizi çizgili olan herşeye CTE Compile Time Error
    Ancakkkk alti kirmizi olan her kod hata degildir

    özellikle dosya okuma ve yazma islemlerinde
    Java exception olasiliğini compile time da kontrol edip
    bize uyari verir

    Unhandled exception: java.io.FileNotFoundException

     */

    public static void main(String[] args) {

        //String str=24; string variableye integer deger atamak istendiğinden hata verir
        int sayi1=34;
        double dbl=sayi1; //auto widening
        short shrt= (short) sayi1;//explicit narrowing yaptik

        for (int i = 0; i < 20; i++) {

            String str2="";

        }

       // System.out.println(i); scope uygun değil
        //System.out.println(str2);str2 scop un dışında yazdırılmak istendğinde hata verir

        String str3=null;
       // System.out.println(str3);//sadece yazdırır ama null olarak atanan
        // variable için diğer nethodlar kullanıldığında hata verir //24. satırda verdiği gibi
       // System.out.println(str3.toLowerCase());//Cannot invoke "String.toLowerCase()" because "str3" is null

        int a=23;
        int b=0;
       // System.out.println(a/b); //burda da syntex acısından bir sorun yok fakat yazdır enter dedğimizde
        //ArithmeticException: / by zero hatası verir

        try { FileInputStream fileInputStream=new FileInputStream("src/ders51_MultipleCheckedExceptions/dersNotlari.txt");

        }catch (FileNotFoundException e){

            System.out.println("dosya yolu hatai");
        }



//Unhandled exception: java. io. FileNotFoundException
    }
}
