public class operMateAulaNube {
    public static void main(String[] args){
    int a = 3, b = 2, c = 1;
    a += b;// a 5
    System.out.println(a);
    c += a;// c 6
    System.out.println(c);
    b += a + b;// b 9
    System.out.println(b);
    c -= a;// c 1 c tenia el valor de 6 - a que tenia 5
    System.out.println(c);
    c *= a / 2;// c 2
    System.out.println(c);
    b %= 5;// b 4
    System.out.println(b);
    b /= c;// b 2
    System.out.println(b);
    b *= a + b;// b 14 
    System.out.println(b);
    a /= b - c * 5;// a 1 
    System.out.println(a);
    }
}  

