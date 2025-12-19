package TEKRAR.Konu27_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_CokKatlıArray {
    public static void main(String[] args) {

        //arrayler cok katlı yani iç içe arraylerdir....

        int [][] arr={{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        System.out.println(arr[0][2]);//2
        System.out.println(arr[3][0]);//10

        System.out.println(arr); //[[I@e9e54c2
        System.out.println(Arrays.toString(arr));//[[I@65ab7765, [I@1b28cdfa, [I@eed1f14, [I@7229724f, [I@4c873330]


        System.out.println(Arrays.deepToString(arr));//[[3, 1, 2, 4], [1, 2], [3, 4, 5], [10], [2, 7]]





    }
}
