/**
 * Ejercicio 46
 *
 * @author Christian Amo
 */
 
public class Ejercicio46 {
  
  public static void main (String args[]) {
    
        System.out.print("Meta la anchura del rectángulo (como mínimo 2): ");
    int anchura = Integer.parseInt(System.console().readLine());

    System.out.print("Ahora introduzca la altura (como mínimo 2): ");
    int altura = Integer.parseInt(System.console().readLine());
    
      for (int i = 1; i <= anchura; i++) {
        System.out.print("*");
      }
      
      for (int i = 2; i < altura; i ++) {
        System.out.print("\n*");
        for (int espacios = 2; espacios < anchura; espacios++) {
          System.out.print(" ");
        }
        System.out.print("*");
      }
      System.out.println();
      
      for (int i = 1; i <= anchura; i++) {
        System.out.print("*");
      }
    }
  }
