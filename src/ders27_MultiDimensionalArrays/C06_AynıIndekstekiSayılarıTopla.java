package ders27_MultiDimensionalArrays;

public class C06_AynıIndekstekiSayılarıTopla {

    public static void main(String[] args) {

        // verielen 2 katlı ve 2 inner arraye sahip bir int arrayde
        // ayni indexe sahip elementleri toplayıp
        // yeni oluşturacağımız tek katlı bir array e bu toplamları atayın

        //output: [5,7,11]
        int [][] arr={{3,4,5}, {2,3,6,7}};
        int ortakIndeksSayısı= arr[0].length<arr[1].length ? arr[0].length:arr[1].length;

        int [] ortakIndekstekisayılarınToplamıArreyi=new int [ortakIndeksSayısı];//[0,0,0];

        for (int i = 0; i <ortakIndekstekisayılarınToplamıArreyi.length ; i++) {

            ortakIndekstekisayılarınToplamıArreyi[i]=arr[0][i]+arr[1][i];

        }

        System.out.println(ortakIndekstekisayılarınToplamıArreyi);
        
    }
}
