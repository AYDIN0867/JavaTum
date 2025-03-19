package ders49_Exception_TryCatcher;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_CatchBlogundakiEninGörevi {

    public static void main(String[] args) {

        //kullanıcıdan iki tamsayı isteyip
        //sayıları birbirine bölün ve sonucu yazdırın





            Scanner scanner=new Scanner(System.in);



            int sayi1= 0;
            int sayi2= 0;

            try {

                System.out.println("lütfen birinci tamsayıyı giriniz");
                sayi1 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("lütfen ikinci tamsayıyı giriniz");
                sayi2 = scanner.nextInt();

                if (sayi2==0){
                    System.out.println("2. sayi 0 olamaz");


                } else {
                    int sonuc=sayi1/sayi2;
                    System.out.println("sayı1/sayı2  :"+ sonuc);

                }

            } catch (InputMismatchException e) {

                System.out.println("Tamsayı degeri girmelisiniz");

                System.out.println(e.getCause());//null

                e.printStackTrace();


            }


        System.out.println("Kod normal calisip bitti");






    }
}
