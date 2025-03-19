package ders13_String_manipulations;

public class C07_SubstringIkiParametre {

    public static void main(String[] args) {

        String metin="java gun gectikce guzellesiyor";
        System.out.println(metin.length());

        // ilk kelime hariç cümleyi yazdırın

        System.out.println(metin.indexOf(" "));
        System.out.println(metin.substring(5));

        // sadece 2. kelimeyi yazdırın

        int ilkSpaceIndeks=metin.indexOf(" ");
        int ikinciSpace=metin.indexOf(" ",ilkSpaceIndeks+1);

        System.out.println(metin.substring(ilkSpaceIndeks,ikinciSpace));

        // aynı indeksler hiçlik yazdırır

        System.out.println(metin.substring(2,2));

        // bastan 10. karakter yazdırma

        System.out.println(metin.charAt(9));
        System.out.println(metin.substring(9,10));
        System.out.println(metin.substring(15,23));// 15 den başalayarak 8 karakter yazdırır



        System.out.println(metin.substring(5,9));

        // sadece 3. harfi başka bir variableye kaydetme

//java gun gectikce guzellesiyor

       // String istenenHarf=metin.charAt(2) charAt char getirdiği için stringe atayamayız

        System.out.println(metin.substring(2,3));

        // 7 indeksteki karakteeri büüyk olarak ayzdırın

        System.out.println(metin.substring(7,8).toUpperCase());


        //  baştan 3. karakterden başlayıp sondan 3.karaktere kadar olan kısmı yazdırın
        System.out.println(metin.substring(2,metin.length()-3));





    }
}
