package ders41_StringBuilder;

public class C02_String_BuilderMethod {

    public static void main(String[] args) {

StringBuilder sb=new StringBuilder("Java");

sb.append(" Candir ");
sb.append(3);
sb.append(true);

        System.out.println(sb);
        String str="ali topu at";
        sb.append(str,3,8);
        System.out.println(sb); //Java Candir 3true topu

        String metin="Ali can";
        System.out.println(metin.replace("Ali", "veli"));//veli can

        System.out.println(sb.replace(11, 18, "*"));

        System.out.println(sb);//Java Candir*topu


        sb.replace(11, 16, ".");

        System.out.println(sb);//Java Candir.

sb.reverse();
        System.out.println(sb);//.ridnaC avaJ
        System.out.println(sb.reverse());//Java Candir.

        System.out.println(sb.insert(4, " hem"));//Java hem Candir.

        System.out.println(sb.deleteCharAt(15)); //Java hem Candir sondaki nokta silindi

    }
}
