/**
 * Ejercicio 33
 *
 * @author Christian Amo
 */
 
public class Ejercicio33 {
  
  public static void main (String args[]) {
    
    System.out.print("Meta La altura de la U que sea mayor de 1: ");
    int altura = Integer.parseInt(System.console().readLine());

    for (int i = 1; i < altura; i++) {
      System.out.print("* ");
      
      for (int j = 2; j < altura; j++) {
        System.out.print("  ");
      }
      System.out.println("*");
    }

    System.out.print("  ");
    
    for (int i = 2; i < altura; i++) {
      System.out.print("* ");
    }

  }
}
