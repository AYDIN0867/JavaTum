package ders51_MultipleCheckedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_MultiCheckedExpections {

    public static void main(String[] args) {

        //notlar dosyasindaki yazilari konsolda yazdirin


        try { FileInputStream fileInputStream=new FileInputStream("src/ders51_MultipleCheckedExceptions/dersNotlari.txt");

            int k=0;

            while ((k=fileInputStream.read())!=-1){

                System.out.print((char)k );
            }

        }catch (FileNotFoundException e){

            System.out.println("dosya bulunamadi...");

        }catch (IOException e){

            System.out.println("dosyadaki bilgiler okunmadı");
        }


/*
IOException e,FileNotFoundException'in parent i oldugundan islem yaparken bu iliskiyi dikkate almalıyız
1- eger ikisinide ayri catc cumleleri ile yazacaksak uste cild excepiton yazılmalıdır

2-eger ikisini ayrı ayrı yazmak istemezsek sadece parent olan IOException'i yazmamiz yeterli olacaktir
cunku IOException ikisini de kapsar





 */










    }



}
