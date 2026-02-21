package TEKRAR.Konu.Konu02;

public class D01_VariablesKullanimi {
    public static void main(String[] args) {


         int sayi=20;
        System.out.println("hesabim");//hesabim
        System.out.println("sayi");//sayi
        System.out.println("Benim adım Cemil,ne istersem yaparim");
  //javada bir metin yazdırmak ile variablen,n değerini yazdırmak farklı şeylerdir
        //bir metin yazdırmak istediğimzide çift tırnak kullanırız içinde ne görürse oldugu gibi
        //yazar ama variablenin değerini yazdırdığımızda ise SADECE variable ismi yazarız


        System.out.println(sayi);
        System.out.println("sayi variablenin degeri : "+sayi);

        int number=40;

        System.out.println("number variable'inin 19. satirdaki degeri : " + number);

        number=number+5; //eşittir işareti assigment sign dır
        // ve eşitliğin önce solunu yapar ve number e yeni deger olarak atar;

        System.out.println("number variable'inin 23. satirdaki degeri : "+number);

        number=2*number+1;

        System.out.println("number variable'inin 28. satirdaki degeri : "+number);//91







    }//main method sonu




}
