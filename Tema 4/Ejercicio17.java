/**
 * Ejercicio 17
 *
 * @author Christian Amo
 */


public class Ejercicio17 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca un número entero: ");
    int n = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra del número introducido es el " + (n % 10));
  }
}
