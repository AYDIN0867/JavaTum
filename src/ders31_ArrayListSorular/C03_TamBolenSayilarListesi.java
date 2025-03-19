package ders31_ArrayListSorular;

import java.util.ArrayList;
import java.util.List;

public class C03_TamBolenSayilarListesi {

    public static void main(String[] args) {

        System.out.println(pozitifTamBölenlerinListesi(25));

        //tam bölenler listesini kullanarak 2 basamaklı asal sayıları yazdırın

        for (int i = 1; i <100 ; i++) {

            int taBolensayisi=pozitifTamBölenlerinListesi(i).size();

            if (taBolensayisi==2){

                System.out.print(i+" ");
            }

        }


    }


    //verilen pozitif bir tamsayıyı tam bölebilen tum pozitif sayıları
    //bize donduren bir method oluşturun




    public static List<Integer>pozitifTamBölenlerinListesi(int sayi){

      List<Integer>tamBolelerListesi=new ArrayList<>();


        for (int i = 1; i <=sayi; i++) {

            if (sayi%i==0){

                tamBolelerListesi.add(i);


            }

        }

        return tamBolelerListesi;
    }
}
