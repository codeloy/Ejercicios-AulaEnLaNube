package Pruebas;
import java.awt.Point;
import java.util.Scanner;
public class ProblemaPunto {
public static void main(String[] args){
    Point p1 = new Point();
    Point p2 = new Point();
    p1.x = (int) Math.random() * 10;
    p1.y = (int) Math.random() * 10;
    p2.x = p1.x * 2;
    p2.y = p1.y * 2;
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca el valor de la absisa");
    int absisa = teclado.nextInt();
    System.out.println("Introduzca el valor de la ordenada");
    int ordenada = teclado.nextInt();
    Point p = new Point();
    p.x = absisa;
    p.y = ordenada;
    System.out.println("El valor de la absisa es: " + absisa + " y el valor de la ordenada es: " + ordenada);
    teclado.close();
    }
}
