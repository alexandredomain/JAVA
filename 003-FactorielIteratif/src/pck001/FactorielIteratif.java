package pck001;
import java.util.Scanner;

/**
 * @author Alexandre Domain
 */

public class FactorielIteratif {

    public static void main(String[] args) {
        System.out.println(calculFactorielIteratif(inputInt("Choisir n pour calculer n! :")));
    }
    
    public static int calculFactorielIteratif(int n) {
        if (n>=2) { // cas 0 et 1 traités dans le else, avec les négatifs
            int i, resultat=1;
            for (i=2;i<=n;i++) {
                resultat *= i;
            }
            return resultat;
        }
        else {
            return 1;
        }
    }
    
    public static int inputInt(String demande){
      Scanner input = new Scanner(System.in);
      System.out.println(demande);
      int nb = input.nextInt();    
      return nb;
    }
    
}
