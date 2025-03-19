package ders06_Operatorler;

public class C02_AndOperatoru {
    public static void main(String[] args) {

      int a=10;
      int b=20;

      // eger sonuca odaklı bir işlem yapacaksak
        // ilk false bulunduğunda genel sonuc false olacağından
        // geriye kalan işlemleri yapmaya gerek KALAMAZ
        // böylece islem HIZLI yapılmıs olur

        boolean genelSonuc1=a>=b && a<b && a>b-8;
        System.out.println(genelSonuc1);// false


        boolean genelSonuc2=a>=b && a<b && a>b-8;
        System.out.println(genelSonuc2);//false

        // bazen 2. ve 3. işlemlerde atamalar yapılabilir
        //eğer o işlemler yapılmazsa atamalarda yapılmamış  olur
        // bu durumda sonuc yine de false olsa da
        // tüm işlemlerin yapılmasını isteriz
        // bunun için & kulllanmayı tercih ederiz

        // ŞÖYLEKİ;

        boolean sonuc1=true;
        boolean sonuc2=true;
        boolean sonuc3=true;

        boolean genelSonuc=(sonuc1=a>=b)&(sonuc2=a<b)&(sonuc3=a>b-8);

        System.out.println(genelSonuc);//false
        System.out.println(sonuc1);//false
        System.out.println(sonuc2);//true
        System.out.println(sonuc3);//false

        boolean sonuc4=true;
        boolean sonuc5=true;
        boolean sonuc6 =true;

        boolean genelSonuc3=(sonuc4=a>=b)&&(sonuc5=a<b)&&(sonuc6 =a>b-8);

        System.out.println(genelSonuc3);//false
        System.out.println(sonuc4);//false
        System.out.println(sonuc5);//true && olduğundan baştaki false çıktığı için atamalara bakmadı
        System.out.println(sonuc6);//true && olduğundan baştaki false çıktığı için atamalara bakmadı









    }
}
