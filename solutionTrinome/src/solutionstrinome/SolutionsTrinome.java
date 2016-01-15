package solutionstrinome;

/**
 * @author Alexandre Domain
 */
public class SolutionsTrinome {

    public static void main(String[] args) {
        System.out.println(solTrinome(1,1,1)) ;
    }
    
    public static String solTrinome(double a, double b, double c) {
        double d = b * b - 4 * a * c ;
        if (d>0) {
            return ("Racines réelles : " + (-b-Math.sqrt(d))/(2*a) + " et " + (-b+Math.sqrt(d))/(2*a));
        }
        else if (d==0) {
            return ("Racine double : " + -b/(2*a));
        }
        else {
            return("Racine complexes : " + -b/(2*a) + -Math.sqrt(-d)/(2*a) + "i" + " et " + -b/(2*a) + "+" + +Math.sqrt(-d)/(2*a) + "i");
        }
    }
    
}
