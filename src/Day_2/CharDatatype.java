package Day_2;

public class CharDatatype {
    public static void main(String[] args) {
        char vellu ='s';
        System.out.println(vellu);
        char adi='+';
        System.out.println(adi);
        char william='2';
        System.out.println(william);
        //TypeCasting
        char ch= '9';
        int x=ch;//implicit typecasting
        System.out.println(x);
        char ron='g';
        int y=(int)ron;//explicit Typecasting
        System.out.println(y);
        char elsa='3';
        int w=elsa;
        System.out.println(w);
        char tom='8';
        System.out.println((int)tom);
        char tummy='i';
        System.out.println(tummy+0);
        System.out.println(tummy+tummy);
        // integer to character conversion
        int m=42;
        char sun=(char)m;
        System.out.println(sun);
    }
}
