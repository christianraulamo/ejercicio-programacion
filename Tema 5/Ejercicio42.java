/**
 * Ejercicio 42
 *
 * @author Christian Amo
 */
 
public class Ejercicio42 {
  
  public static void main (String args[]) {
    
    System.out.print("Meta un numero positivo: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    boolean esPrimo;
    
    for (int n = numeroIntroducido; n < numeroIntroducido + 5; n++) {

      esPrimo = true;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          esPrimo = false;
        }
      }

      if (esPrimo) {
        System.out.println(n + " es primo");
      } else {
        System.out.println(n + " no es primo");
      }
    }
    System.out.println();
  }
}
