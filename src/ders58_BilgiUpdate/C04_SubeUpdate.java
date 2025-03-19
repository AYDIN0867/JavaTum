package ders58_BilgiUpdate;

import ders57_MapStringValue.OgrenciMap;

import java.util.Set;

public class C04_SubeUpdate extends OgrenciMap {

    public static void main(String[] args) {

  //10/K sinifindaki ogrencilerin subelerini Z yapin

        Integer sinif=10;
        String eskiSube="K";
        String yeniSube="Z";

        //KEY olamadan update yapamayacağımız için
        //güncellemeye value collection'i ile değil
        //keySet ile cikmalıyız

        //1- tum key'leri kaydederiz
        //ogrenciMap.keySet () method u Set olarak tum key'leri getirir

        Set<Integer> ogrenciKeySet= OgrenciMap.ogrenciMap.keySet();
        //2-bir for-each loop ile her bir key i ele alalım
        for (Integer eachKey
                 :  ogrenciKeySet ) { //101,102,103,104,105,106,107

            //3-each 'in getirdiği key'e ait valueyi kaydedelim

     String eachValue=ogrenciMap.get(eachKey);

            //4- value'yu split ile bolup

            String [] eachValueArr=eachValue.split("-");
            //bir array olarak kaydedelim ki bilgilre dogrudan ulasabilelim


            //5- kaydettiğimiz valueArr'inde istenen bilgiyi kontrol edip
            //istenen sarti sağlayan ogrencilerin, istenen bilgileri update edin
            //     101=Ali-Can-10-H-MF,
            if (eachValueArr[2].equalsIgnoreCase(sinif+"")&&eachValueArr[3].equalsIgnoreCase(eskiSube)){
                eachValueArr[3]=yeniSube;

                //10/K sinifindaki ogrencilerin subelerini Z yapin

                //6-array de yapılan değişiklikliği ma e tasimak icin
                //arryi (tire) - ile birleştirip yeniValue olusturalim

                String birlesenYeniValue=String.join("-",eachValueArr);

                //7-eachKey ve yeni value ile map i update edelim...

                ogrenciMap.put(eachKey,birlesenYeniValue);
            }





        }


        //6. ve 7 adımları if içine yazarak tüm ögrencileri yeniden map e yüklemesin sadece sınıf ve
        // subesi istenen değere şit olan öğrencileri güncellesin ve map e kelsin
        System.out.println(ogrenciMap);





    }
}
