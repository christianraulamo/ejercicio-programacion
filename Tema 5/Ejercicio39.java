/**
 * Ejercicio 39
 *
 * @author Christian Amo
 */
 
public class Ejercicio39 {
  
  public static void main (String args[]) {
    
    int numeroIntroducido;

    System.out.print("Meta un número entero positivo: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());

    for (int n = 1; n <= numeroIntroducido; n++) {

      int factorial = n;

      for (int i = 1; i < n; i++) {
        factorial *= i;
      }

      System.out.println(n + "! = " + factorial);
    }
  }
}
