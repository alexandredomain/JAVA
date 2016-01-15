package pck01;

/**
 * @author Alexandre Domain
 */

public class CalculPerimetreAire {
    
    static double pi = 3.14159200 ; // variable doit être définie en dehors des méthodes mais dans la classe pour pouvoir être utilisée dans toutes les méthodes de cette classe --> pas de variables globales dans JAVA
    
    public static void main(String[] args) {
        System.out.println("Mon premier programme en JAVA");
        System.out.println("Périmètre du cercle de rayon 2 = " + perimetreCercle(2));
        System.out.println("Aire du disque de rayon 3 = " + aireDisque(3));
    }
    
    public static double perimetreCercle (double rayon) {
        double perim ;
        perim = 2 * pi * rayon ;
        return perim ;
    }
    
    public static double aireDisque (double rayon) {
        double aire = pi * rayon * rayon ;
        return aire ;
    }
    
}