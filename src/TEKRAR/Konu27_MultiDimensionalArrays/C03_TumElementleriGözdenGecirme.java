package TEKRAR.Konu27_MultiDimensionalArrays;

public class C03_TumElementleriGözdenGecirme {
    public static void main(String[] args) {

        int [][] arr={{2,3,7},{3,5},{4},{1,2,3,6,8}};

        //arr deki cift sayiların toplamını yazdirin...

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j]%2==0){

                    toplam+=arr[i][j]; //arr deki çift sayıların toplamı :22
                }

            }

        }

        System.out.println("arr deki çift sayıların toplamı :"+toplam);





    }
}
