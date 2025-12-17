package TEKRAR.Konu25_Arrays;

public class C02_ArraysLength {
    public static void main(String[] args) {

        String str="Java Candir";
        //String deki karakter sayısını yazalım
        System.out.println(str.length());//11


        int [] arr={3,5,7,9,1,2};
       //arr nin lenght i nı yazalım
        System.out.println(arr.length);//6

        // String in son karakterini yazdirin...
        System.out.println(str.charAt(str.length()-1));//r

        //arr nin son elementini yazdırın...

        System.out.println(arr[arr.length - 1]);//element oldugu için doğrudan yazn
        //Arrays class ına gerek kalmadan yazırılabilir..

        //String in sondan 3. elementini yazdıralım...
        System.out.println(str.charAt(str.length() - 3));//d

        //arr nin sondan 3. elementini yazdırın

        System.out.println(arr[arr.length - 3]);//9


    }
}
