/**
 * Ejercicio 06
 *
 * @author Christian Amo
 */
 
public class Ejercicio06 {
  
  public static void main (String args[]) {
    
    int numeroIntroducido = 0;
    int numero = (int)(Math.random()*101);
    int intentos = 5;
    int cuenta = 0;
    
    do {
      System.out.println("Intenten adivinar el numero del 0 al 100: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido == numero) {
        System.out.print("Enorabuena su numero es el correcto.");
      }
      if (numeroIntroducido < numero) {
        System.out.println("Lo siento, su numero no es el correcto.");
        System.out.println("Su numero es menor.");
        System.out.print("los intentos restantes son: " + intentos);
        intentos --;
      }
      if (numeroIntroducido > numero) {
        System.out.println("Lo siento, su numero no es el correcto.");
        System.out.println("Su numero es mayor.");
        System.out.print("los intentos restantes son: " + intentos);
        intentos --;
      }
    cuenta++;
    } while ((cuenta == 5) || (numeroIntroducido == numero));
   
  }
}
