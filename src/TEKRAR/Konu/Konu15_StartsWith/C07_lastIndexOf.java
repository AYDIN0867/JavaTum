package TEKRAR.Konu.Konu15_StartsWith;

public class C07_lastIndexOf {
    public static void main(String[] args) {

        String  cumle=" başlamak bitirmenin yarısıdır başlamak diyen yanlış demiş;çünlkü kendisidir demiş ki demiş";

        //cumlede "demiş" in ilk kullanım index'i

        System.out.println(cumle.indexOf("demiş"));//44

        // cumlede demiş ikinci kullanım indeksi nedir

        System.out.println(cumle.indexOf("demiş", cumle.indexOf("demiş") + 1));//68

        // cumlede demiş 3. kullanım indeksi

        System.out.println(cumle.indexOf("demiş",69)); //77

        //cumlede baslamak kelimesinin ilk kullanımı

        System.out.println(cumle.indexOf("başlamak")); //1 1 olmasının nedeni cumlenin baslangıcında
        //bosluk karakteri var onu sıfır, baslamayı ise 1 de goruyor...

        //metinda baslamak kelimesinin ikinci kullanım indeksi kactır

        System.out.println(cumle.indexOf("başlamak", cumle.indexOf("başlamak") + 1));//31

        //cumlede demiş in son kullanım indeksi nedir

        System.out.println(cumle.lastIndexOf("demiş"));//86

        System.out.println(cumle.lastIndexOf("başlamak"));//31

        // cumlede demiş in son kullanım indeksi nedir

        System.out.println(cumle.lastIndexOf("demiş"));//86

        // cumlede demiş in sondan 2. kullanım indeksi nedir

        System.out.println(cumle.lastIndexOf("demiş", cumle.lastIndexOf("demiş") - 1));//77

    }
}
