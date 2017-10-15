/**
 * Ejercicio 14
 *
 * @author Christian Amo
 */


public class Ejercicio14 {

  public static void main(String[] args) {
        
    System.out.print("<introduzca un número entero: ");
    int n = Integer.parseInt(System.console().readLine());

    if ((n % 2) == 0) {
      System.out.print("El número introducido es par");
    } else {
      System.out.print("El número introducido es impar");
    }

    if ((n % 5) == 0) {
      System.out.println(" y divisible entre 5.");
    }
     else {
      System.out.println(" y no es divisible entre 5.");
    }
  }
}
