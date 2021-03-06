/**
 * Ejercicio 06
 *
 * @author Christian Amo
 */

public class Ejercicio06 {

  // las constantes se declaran fuera del main
  final static double g = 9.81;

  public static void main(String[] args) {

    System.out.println("Cálculo del tiempo de caída de un objeto.");
    System.out.print("Introduzca la altura en m desde la que cae el");
    System.out.print(" objeto: ");
    Double h = Double.parseDouble(System.console().readLine());

    double s = Math.sqrt(2*h/g);

    System.out.printf("El objeto tarda %.2f segundos en caer.\n", s);
  }
}
