package ders26_Arrays_Methodları;

import java.util.Arrays;

public class C01_Sort {

    public static void main(String[] args) {


        String [] sort1={"ali","Mehmet","Safinaz","haydarıkerrar","ernosto","kabasakal"};//[Mehmet, Safinaz, ali, ernosto, haydarıkerrar, kabasakal]

        //arrayi natıral ordere göre sıralayıp,yazdırın

        Arrays.sort(sort1);
        System.out.println(Arrays.toString(sort1));

// naturel order metinler için sözluk sıralamasına göre sıralama demektir.
        // ancak java nin casee sensetive olduğununu ve kucuk olduğunu ve
        // kucuk harflerden buyuk harflerden sonra geldiğini unutmamalıyız



        String str="java candir";
        System.out.println(str.toUpperCase());//JAVA CANDİR
        System.out.println(str);//java candir

        //NOT2:string immutabledir...arreylerde ve arrylistlerde method ile yapılan ddğişiklikler kalııcıdır..
        // Arrays.sort(sort1); bu işlem arreyi kalıcı olarak sıralamıştır stringler gibi atama yapmaya gerek kalmamaıştır
        //


    }


}
