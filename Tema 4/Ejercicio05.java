/**
 * Ejercicio 05
 *
 * @author Christian Amo
 */

public class Ejercicio05 {
  public static void main(String[] args) {

    System.out.print("El programa resuelve ecuaciones de primer ");
    System.out.println ("grado del tipo ax + b = 0");
    System.out.print("Introduzca el valor de a: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("Ahora introduzca el valor de b: ");
    Double b = Double.parseDouble(System.console().readLine());

    if (a == 0) {
      System.out.println("Esa ecuación no tiene solución real.");
    } 
    else {
      System.out.println("x = " + (-b/a));
    }
  }
}
