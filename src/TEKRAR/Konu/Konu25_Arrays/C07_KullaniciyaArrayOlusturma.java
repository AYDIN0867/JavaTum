package TEKRAR.Konu.Konu25_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_KullaniciyaArrayOlusturma {
    public static void main(String[] args) {

        //Kullanıcıdan array'in boyutunu ve Integer elementlerini alip
        // array'i olusturun...

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen oluşturulacak int array'in boyutunu giriniz...");
        int Istenenlenght=scanner.nextInt();

        int [] arr=new int[Istenenlenght];

        for (int i = 0; i < arr.length; i++) {

            System.out.println("Array e eklemek icin bir tamsayı giriniz...");
            arr[i]= scanner.nextInt();

        }

        System.out.println(Arrays.toString(arr));


    }


  //Kullanıcıdan array'in boyutunu ve Integer elementlerini alip
  // array'i olusturan ve bize donduren bir metod olusturun


  public static int [] arrOlustur(){
      Scanner scanner=new Scanner(System.in);
      System.out.println("lütfen oluşturulacak int array'in boyutunu giriniz...");
      int Istenenlenght=scanner.nextInt();
      int [] arr=new int[Istenenlenght];

      for (int i = 0; i < arr.length; i++) {

          System.out.println("Array e eklemek icin bir tamsayı giriniz...");
          arr[i]= scanner.nextInt();

      }

      System.out.println(Arrays.toString(arr));



return arr;
  }

}
