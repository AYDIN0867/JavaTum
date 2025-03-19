package ders27_MultiDimensionalArrays;

public class C02_TumElemanları_Toplama {

    public static void main(String[] args) {
     int [] sayilar ={3,6,9,1};
     // arrayin tum elementlerinin toplamını yazdırın

        int toplam=0;

        for (int i = 0; i < sayilar.length; i++) {

            toplam+=sayilar[i];

        }

        System.out.println("sayılar arrayindeki elementlerin toplamı :"+toplam);//19

        int [][] arr={{2,3,7,},{3,5},{4},{1,2,3,6,8}};
        toplam=0;
        //array'in tum elementlerinin toplamını yazdırın

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

              toplam+=arr[i][j];

            }

        }
        System.out.println("tüm elementlerin toplamı "+ toplam);//44


    }
}
