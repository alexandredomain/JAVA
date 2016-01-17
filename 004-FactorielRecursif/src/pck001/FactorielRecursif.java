package pck001;
import java.util.Scanner;

/**
 * @author Alexandre Domain
 */

public class FactorielRecursif {

    public static void main(String[] args) {
        System.out.println(calculFactorielRecursif(inputInt("Choisir n pour calculer n! :")));
    }
    
    public static int calculFactorielRecursif(int n) {
        if (n>0) {
            return n*calculFactorielRecursif(n-1);
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
