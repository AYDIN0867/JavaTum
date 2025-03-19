package ders37_PasByValue;

public class C01_PassByValue {

    public static void main(String[] args) {


        String str="Java candir";

        System.out.println(str.toUpperCase());//JAVA CANDIR

        System.out.println(str.substring(0, str.length() - 1));//Java candi

        System.out.println(str);//Java candir

        /*

        bir variableti argument olarak kullanıp başka bir methoda gönderdiğimizde
        java variablenin kendisini değil value (deger) sunu gonderir
                 */

String isim="ali mert yilmaz can";
//verilen isim kaç kelime olursa olsun
        // tum isimleri ilk harfleri buyuk,sonraki harfleri kucuk olarak duzenleyip
        //yazdıran bir method olusturun




       ismiDuzenle(isim);//ismin duzenlenmis hali :Ali Mert Yilmaz Can
        ismiDuzenle("pelin su yilmaz demir");//Pelin Su Yilmaz Demir

        //verilen cumleyi buyuk harfe cevirip yazdiran bir method olusturun



        String cumle="Ali okula git";
        buyukHarfeCevir(cumle);
        System.out.println("ana methodda cumle"+cumle);//ana methodda cumleAli okula git

    }

    public static void buyukHarfeCevir(String cumle) {

        cumle=cumle.toUpperCase();

        System.out.println("methodda cumle"+cumle); //ALI OKULA GIT

    }

    public static void ismiDuzenle(String str) {

        System.out.println("method basşinda str  :"+str);

        String [] isimlerArr=str.split(" ");
        String yeniIsim="";

        for (int i = 0; i < isimlerArr.length; i++) {

          yeniIsim+=isimlerArr[i].substring(0,1).toUpperCase()+isimlerArr[i].substring(1).toLowerCase();

          if ((i<isimlerArr.length-1)){
              yeniIsim+=" ";
          }

        }

        System.out.println("ismin duzenlenmis hali :"+yeniIsim);
    }


}
