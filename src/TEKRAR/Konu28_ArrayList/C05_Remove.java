package TEKRAR.Konu28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Remove {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>(Arrays.asList(4,6,1,9,3));
        List<String> isimler=new ArrayList<>(Arrays.asList("Ali","Veli","Cemil","Ayşe","Fatma","Hatice"));


        //isimler listesinden Aliyi silin

        isimler.remove("Ali");
        System.out.println(isimler);//[Veli, Cemil, Ayşe, Fatma, Hatice]

        //isimler listesinden ikinci ineksteki isimi silin

        isimler.remove(2);
        System.out.println(isimler);//[Veli, Cemil, Fatma, Hatice]


    }
}
