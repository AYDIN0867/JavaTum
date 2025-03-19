package ders17_for_loop;

import java.util.Scanner;

public class C13_termometre {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println( "termometrenin sıcaklık değerini giriniz");
        int sıcaklık=scanner.nextInt();

        if (sıcaklık>22){

            System.out.println("Hava Durumu: SICAK");
        }else{

            System.out.println("Hava Durumu:Soğuk");
        }



    }
}
