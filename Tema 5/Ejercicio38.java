/**
 * Ejercicio 38
 *
 * @author Christian Amo
 */
 
public class Ejercicio38 {
  
  public static void main (String args[]) {
    System.out.print("Meta la altura del reloj de arena: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    int altura = 1;
    int asteriscos = alturaIntroducida;
    int espaciosExteriores = 0;

      while (altura < alturaIntroducida / 2 + 1) {
        
        for (int i = 1; i <= espaciosExteriores; i++) {
          System.out.print(" ");
        }
        
        for (int i = 0; i < asteriscos; i++) {
          System.out.print("*");
        }
        
        System.out.println();
        altura++;
        espaciosExteriores++;
        asteriscos -= 2;
      }
      
      espaciosExteriores = alturaIntroducida / 2;
      altura = 1;
      while (altura <= alturaIntroducida / 2 + 1) {
        
        for (int i = 1; i <= espaciosExteriores; i++) {
          System.out.print(" ");
        }
        
        for (int i = 0; i < asteriscos; i++) {
          System.out.print("*");
        }
        
        System.out.println();
        altura++;
        espaciosExteriores--;
        asteriscos += 2;
      } 
    } 
  }

