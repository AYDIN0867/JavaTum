package ders19_Method;

public class C07_MetniTerstenYazdıranMetod {

    public static void main(String[] args) {

        //metni tersten yazdıran bit metod olusturun....

        metniTerstenYazdir("java bu işi çözmüş....");


    }


    public static void metniTerstenYazdir(String metin){

        for (int i =metin.length()-1; i >=0 ; i--) {

            System.out.print(metin.charAt(i));


        }



    }
}
