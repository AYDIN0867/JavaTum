package ders25_Arrays;

public class C02_Length {
    public static void main(String[] args) {

      String str="java Candir";
      int [] arr={3,5,7,9,1,2};
      //String deki karakter saysını yazdırın
        System.out.println(str.length());//10 length de parantez var

      //   arr deki element sayısını yazdırın
        System.out.println(arr.length); //length de parantez yok çünkü arrey


        //Stringin son karakterini yazdırın

        System.out.println(str.charAt(str.length()-1));//r
        System.out.println(str.substring(str.length()-1));

     // arr in son elementini yazdırın

        System.out.println(arr.length - 1);

        // stringin sondan 3. elemanını yazdırın

        System.out.println(str.substring(str.length() - 3,str.length()-2));//d
        System.out.println(str.charAt(str.length()-3));//d




    }
}
