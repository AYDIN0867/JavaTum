package ders60_NestedMap;

import java.util.HashMap;
import java.util.Map;

public class C02_RezervasyonMapOlusturma {

    public static void main(String[] args) {

     /*
     Asagidaki rezervasyonu   bir map olarak olusturun

     { "firstname:"Ahmet",
     "lastname":"Bulut",
     "total prices":500,
     "depositpaid":false,
     "bookingdates":{

        "checkin" :"2024-07-21",
        "checkout" :"2024-08-10"

        },

        "additionalneeds": "wi-fi"


      */

        Map<String,String> bookingdatesmapi=new HashMap<>();
        bookingdatesmapi.put("checkin","2024-07-21");
        bookingdatesmapi.put("checkout","2024-07-21");

        Map<String,Object> rezervasyonMapi=new HashMap<>();
        rezervasyonMapi.put("firstname","Ahmet");
        rezervasyonMapi.put("lastname","Bulut");
        rezervasyonMapi.put("total prices",500);
        rezervasyonMapi.put("depositpaid",false);
        rezervasyonMapi.put("bookingdates",bookingdatesmapi);
        rezervasyonMapi.put("additionalneeds","wi-fi");





       //rezervasyondaki fisrtname'i yazdırın

        System.out.println(rezervasyonMapi.get("firstname"));//Ahmet

        // rezervasyondaki deposit i  yazdırın

        System.out.println(rezervasyonMapi.get("depositpaid"));//false

        // rezervasyondaki checkin i  yazdırın

        System.out.println(((Map<String, String>) rezervasyonMapi.get("bookingdates")).get("checkin"));//2024-07-21

        System.out.println(((Map<String, String>) rezervasyonMapi.get("bookingdates")).get("checkout"));//2024-07-21

        //totalprice 400 den düsük ise "super" 400 evya daha fazla ise "pahali" yazdirin

        Integer totalPriceDeger=(Integer) rezervasyonMapi.get("total prices");

        if (totalPriceDeger<400){

            System.out.println("super");
        }else System.out.println("pahali"); //pahali




    }
}
