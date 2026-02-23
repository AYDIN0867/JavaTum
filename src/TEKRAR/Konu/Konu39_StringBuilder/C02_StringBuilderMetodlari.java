package TEKRAR.Konu.Konu39_StringBuilder;

public class C02_StringBuilderMetodlari {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Umut");
        sb.append("Hayattır");
        sb.append(3);
        sb.append(true);

        System.out.println(sb); //UmutHayattır3true

        String str1="Ali topu at";
        sb.append(str1,3,8);
        System.out.println(sb);//UmutHayattır3true topu





    }
}
