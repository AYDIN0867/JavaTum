package ders55_collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C04_BelirliElementleriiSilme {

    public static void main(String[] args) {

        //verilen string bir set'teki istenmeyen
        // harf içeren elementleri silin


        Set<String> isimler=new HashSet<>();

        isimler.add("Cem");
        isimler.add("Murat");
        isimler.add("Furkan");
        isimler.add("Cem");
        isimler.add("Cem");
        isimler.add("Sabri");
        isimler.add("Ridvan");

        System.out.println(isimler);//[Ridvan, Sabri, Cem, Furkan, Murat]

        String istenmeyenHarf ="e" ;

      /*

       for ( String each  :isimler   ) {

            if (each.contains(istenmeyenHarf))

                isimler.remove(each);


           }

        System.out.println(isimler);
       */


        Iterator itr=isimler.iterator();

        while (itr.hasNext()){

            if (((String)itr.next()).contains(istenmeyenHarf)){

                itr.remove();
            }
        }

        System.out.println("isimler listesinin son hali"+ isimler);//isimler listesinin son hali[Ridvan, Sabri, Furkan, Murat]
//cemler gitti çünkü istenmeyen e harf var




    }
}
