public class OperadoresRelacionales {
    public static void main(String[] args){
        int precio1 = 10;
        int precio2 = 30;
        boolean barato = precio1 > precio2;// false
        System.out.println(barato);
        boolean iguales1 = 40 == (precio1 + precio2);//true
        System.out.println(iguales1);
        boolean iguales2 = 40 == precio1 + precio2;//true
        System.out.println(iguales2);
        //boolean iguales3 = (40 == precio1) + precio2;//ERROR
        boolean distintos = precio1 != precio2;//true
        System.out.println(distintos);
        String nombre1 = "Pepe";
        String nombre2 = "Jose";
        String nombre3 = "pepe";
        //Las Strings no se comparan con == porque son Objetos, se usa .equals
        boolean inguales1 = nombre1.equals(nombre2);//false
        boolean inguales2 = nombre1.equals(nombre3);//false
        boolean inguales3 = nombre1.equalsIgnoreCase(nombre3);//true
    }
}
