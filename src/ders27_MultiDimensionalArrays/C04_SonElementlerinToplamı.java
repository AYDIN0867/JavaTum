package ders27_MultiDimensionalArrays;

public class C04_SonElementlerinToplamı {

    public static void main(String[] args) {


        // Verilen 2 katlı bir array de
        // her bir inner array in son elementlerinin toplamını
        //yazdıran bir method olusturun


        int [][] arr={{2,3,7,1,2},{3,5,1,2},{4,1,2},{1,2,3,6,8,1,2},{2}};






sonElementlerinTopla(arr);//10


    }public static void sonElementlerinTopla(int arr[][]){

        int sonElementlerininToplamı=0;

        for (int i = 0; i < arr.length; i++) {

         sonElementlerininToplamı+= arr[i][arr[i].length-1];

        }

        System.out.println("son elemanlarının toplamı: "+ sonElementlerininToplamı);

    }



}
