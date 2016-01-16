package pck001;
import java.util.Scanner;

/**
 * @author Alexandre Domain
 */

public class Factoriel {

    public static void main(String[] args) {
        System.out.println(calculFactoriel(inputInt("Choisir n pour calculer n! :")));
    }
    
    public static int calculFactoriel(int n) {
        if (n>=0) {
            int i, resultat=1;
            for (i=2;i<=n;i++) {
                resultat *= i;
            }
            return resultat;
        }
        else {
            return 0;
        }
    }
    
    public static int inputInt(String demande){
      Scanner input = new Scanner(System.in);
      System.out.println(demande);
      int nb = input.nextInt();    
      return nb;
    }
    
}
