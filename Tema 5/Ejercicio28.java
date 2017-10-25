/**
 * Ejercicio 28
 *
 * @author Christian Amo
 */
 
public class Ejercicio28 {
  
  public static void main (String args[]) {
    
    int numeroIntroducido;
    
  do {
    System.out.print("Introduzca un numero entero: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    if (numeroIntroducido <0) {
      System.out.println("El número metido no es correcto.");
    }
  } while (numeroIntroducido < 0);

    int factorial = numeroIntroducido;
    if (numeroIntroducido == 0) {
      System.out.println("El factorial del " + numeroIntroducido + " es 1.");
    } else {
      for (int i = 1; i < numeroIntroducido; i++) {
        factorial *= i;
      }
      
      System.out.println(numeroIntroducido + "! = " + factorial);   
    } 
  }
}

