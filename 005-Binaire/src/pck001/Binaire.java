package pck001;
import java.util.Scanner;

/**
 * @author Alexandre Domain
 */

public class Binaire {
    
    public static void main(String[] args) {
        convertirEnBinaire(inputInt("Quel nombre entier voulez-vous convertir en binaire ?"));
    }
    
    public static void convertirEnBinaire(int n) {
        if (n>0) {
            convertirEnBinaire(n/2);
            System.out.print(n%2);
        }
        else  {
            System.out.println("Choisir un nombre positif svp...");
        }
    }
    
    public static int inputInt(String demande){
      Scanner input = new Scanner(System.in);
      System.out.println(demande);
      int nb = input.nextInt();    
      return nb;
    }
    
}
