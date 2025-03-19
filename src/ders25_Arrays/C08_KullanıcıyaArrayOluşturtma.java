package ders25_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C08_KullanıcıyaArrayOluşturtma {

    public static void main(String[] args) {


// kullanıcıdan arayin boyutunu ve Integer elementlerini alıp
// arrayi olusturun







        // kullanıcıdan arrayin boyutunu ve ınteger elementlerini alıp
        // arrayi oluşturan ve bize DONDUREN bir method oluşturun


    }

    public static int [] integerArrayOlustur(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen oluşturulacak integer arrayin boyutunu girimiz");
        int verielnlength=scanner.nextInt();
        int [] arr=new int[verielnlength];

        for (int i = 0; i < arr.length; i++) {

            System.out.println("arreye eklemek için bir tamsayı giriniz");
            arr[i]=scanner.nextInt();
        }


return arr;
    }


}
