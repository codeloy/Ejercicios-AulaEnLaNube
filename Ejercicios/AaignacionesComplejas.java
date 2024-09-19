import javax.sound.sampled.SourceDataLine;

public class AaignacionesComplejas {
    public static void main(String[] args){
        int a = 1, b = 2, c = 3;
        b = ++c;// b 4
        System.out.println(imprimeResultados(c, a, b));
        a += b++;// a 5 a+b++ 
        System.out.println(imprimeResultados(c, a, b));
        a = a+++a;// a 11 (a++)+a
        System.out.println(imprimeResultados(c, a, b));
        a -= b--;// a 6 y b 4 (a-b)--
        System.out.println(imprimeResultados(c, a, b));
        c = a++ - ++b;// b5 - a++
        System.out.println(imprimeResultados(c, a, b));
        c -= ++a;// c-(a++) c-7 a8 b5
        System.out.println(imprimeResultados(c, a, b));
        a -= ++c;// a-(++c) c-6 a14 b5
        System.out.println(imprimeResultados(c, a, b));
        a -= c++;// a-(c++) a20 c-5
        System.out.println(imprimeResultados(c, a, b));
        a -= --c;// a-(--c)c -6 a26
        System.out.println(imprimeResultados(c, a, b));
       
    }
    public static String imprimeResultados(int c, int a, int b){
        String resultado = "Los valores son C:"+c+" A:"+a+" B:"+b;
        return resultado;
    } 
}
