/**
 * Ejercicio 18
 *
 * @author Christian Amo
 */

public class Ejercicio18 {

  public static void main(String[] args) {
    
    int n, primera = 0;
    
    System.out.print("Introduzca un número entero (de 5 cifras como");
    System.out.print(" máximo): ");
    n = Integer.parseInt(System.console().readLine());
    
    if ( n < 10 ) {
      primera = n;
    }
    
    if (( n >= 10 ) && ( n < 100 )) {
      primera = n / 10;
    }
    
    if (( n >= 100 ) && ( n < 1000 )) {
      primera = n / 100;
    }
    
    if (( n >= 1000 ) && ( n < 10000 )) {
      primera = n / 1000;
    }
    
    if ( n >= 10000 ) {
      primera = n / 10000;
    }
    
    System.out.println("La primera cifra del número introducido es el " + primera);
  }
}
