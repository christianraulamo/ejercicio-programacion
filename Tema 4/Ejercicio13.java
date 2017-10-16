/**
 * Ejercicio 13
 *
 * @author Christian Amo
 */

public class Ejercicio13 {

  public static void main(String[] args) {
    
    int aux;
        
    System.out.print("Este programa ordena tres números");
    System.out.println(" introducidos por teclado.");
    System.out.println("<introduce los tres números y pulsando INTRO:");
    int a = Integer.parseInt(System.console().readLine());
    int b = Integer.parseInt(System.console().readLine());
    int c = Integer.parseInt(System.console().readLine());

    // ordenación de los dos primeros números
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
    
    // ordenación de los dos últimos números
    if (b > c) {
      aux = b;
      b = c;
      c = aux;
    }
    
    // se vuelven a ordenar los dos primeros
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
        
    System.out.print("Los números introducidos ordenados de menor");
    System.out.println(" a mayor son " + a + ", " + b + " y " + c + "."); 
  }
}
