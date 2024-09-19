package Pruebas;

public class Prueba {  
    public static double generarAleatoreo(double x, double y){
        double numAlea = Math.random();
        double numRango = x + numAlea * (y - x);
        return numRango;
    }
public static void main(String[] args){
    double numRam = generarAleatoreo(14.2, 40.0);
    System.out.println(numRam);
}
}
