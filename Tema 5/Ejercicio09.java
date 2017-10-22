/**
 * Ejercicio 09
 *
 * @author Christian Amo
 */


public class Ejercicio09 {

  public static void main(String[] args) {
    
    int numeroDeDigitos = 1, n, numeroIntroducido;

    System.out.print("Meta un numero entero y el programa le dira");
    System.out.print(" cuantos dígitos tiene: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    n = numeroIntroducido;
    
    while (n > 10) {
      n /= 10;
      numeroDeDigitos++;
    }
    
    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");

  }
}
