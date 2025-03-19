package ders51_MultipleCheckedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_CheckedExceptionsveThrows {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fileInputStream=
                new FileInputStream("src/ders51_MultipleCheckedExceptions/dersNotlari.txt");
        //Unhandled exception: java. io. FileNotFoundException
        /*
        Compile time exception'larda Java bize 2 alternatif sunar;
        1-Java ile try-catch yapabiliriz exception kontrol altina alinip e objesine kaydedilir
        ve kod normal calismaya devam eder

        2- eger exception'u kontrol altına almak istemiyor (ornegin dosyaya ulasamıyorsak
        kodun calismaya devam etmesinin bir anlami kalmiyorsa) amacimiz sadece kirmizi cizgiyi
        kaldirip,Class'i Run edebilir hale getirmek ise
        sorumlulugu aldigimizi java ya soylemeli ve bu class i sonradan kullanacak isnsanlari uyarmaliyiz...

        Bunun için method signutarelere "throws FileNotFoundException" ekleyebiliriz

         */



    }
}
