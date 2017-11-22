/**
 * Ejercicio 20
 *
 * @author Christian Raúl Amo Olsson
 */


public class Ejercicio20 {
    public static void main(String[] args) {
        
        
    System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
    int capacidad = Integer.parseInt(System.console().readLine());
    
    int llenado = (int)(Math.random() * capacidad);
    for (int i = capacidad; i > 0; --i) {
      System.out.print("*");
      if (i > llenado) {
        for (int j = 0; j < 4; ++j) {
          System.out.print(" ");
        }
      } else {
        for (int j = 0; j < 4; ++j) {
          System.out.print("=");
        }
      }
      System.out.println("*");
    }
        
    System.out.println("******");
    System.out.print("Su cuba puede contener " + capacidad + " litros, ");
    System.out.print("y contiene " + llenado + " litro/s.");
    }

}
