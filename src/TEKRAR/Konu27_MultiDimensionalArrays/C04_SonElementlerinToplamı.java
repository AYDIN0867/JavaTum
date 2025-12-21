package TEKRAR.Konu27_MultiDimensionalArrays;

public class C04_SonElementlerinToplamı {
    public static void main(String[] args) {

        // Verilen 2 katli bir array de
        // her bir inner array in son elementlerinin toplamını
        // yazdıran bir metod olusturun


        int [][] arr ={{2,3,7,1,2},{3,5,1,2},{4,1,2},{1,2,3,6,8,1,2},{2}};




    }

    public  static void sonElementleriTopla(int [][] arr ){

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

          toplam+= arr[i][arr.length-1];

        }


        System.out.println("son elementlerinin toplamı :"+ toplam);


    }


}
