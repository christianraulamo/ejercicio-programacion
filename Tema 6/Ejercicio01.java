/**
 * Ejercicio 01
 *
 * @author Christian Amo
 */
 
public class Ejercicio01 {
  
  public static void main (String args[]) {
    
    System.out.println("El numero dde los tres dados son: ");
    
    
    int Sumatorio = 0;

    for (int i = 1; i <= 3; i++) {
      int numero = (int)(Math.random()*6) + 1;
      System.out.print( numero + " ");
      Sumatorio += numero;
    }
    System.out.println("");
    System.out.print("El sumatorio es: " + Sumatorio);
    
  }
}

