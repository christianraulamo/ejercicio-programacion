/**
 * Ejercicio 17
 *
 * @author Christian Amo
 */


public class Ejercicio17 {

  public static void main(String[] args) {
    
    int numeroIntroducido = 0;
    
    do {
      System.out.print("Meta un número entero positivo: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if(numeroIntroducido < 0) {
        System.out.println("El número introducido no es correcto, debe introducir un número positivo.");
      }
    } while (numeroIntroducido < 0);
    
    int suma = 0;
    
    for(int i = numeroIntroducido; i < numeroIntroducido + 100; i++) {
      suma += i;
    }

    System.out.println("La suma de los 100 números siguientes a " + numeroIntroducido + " es " + suma);
  }
}
