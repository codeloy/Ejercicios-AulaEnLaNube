public class Asignacion{
int a = 3, b = 2, c = 1;
a += b;
System.out.println(a);
c += a;
System.out.println(c);
b += a + b;
System.out.println(b);
c -= a;
System.out.println(c);
c *= a / 2;
System.out.println(c);
b %= 5;
System.out.println(b);
b /= c;
System.out.println(b);
b *= a + b;
System.out.println(b);
a /= - c * 3;
System.out.println(a);
}
