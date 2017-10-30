/**
 * Ejercicio 40
 *
 * @author Christian Amo
 */
 
public class Ejercicio40 {
  
  public static void main (String args[]) {
    
    System.out.print("Meta la altura del rombo: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    int espaciosInternos = 0;
    int espaciosExteriores = alturaIntroducida / 2;
      
      int altura = 1;
          
      while (altura <= alturaIntroducida / 2 + 1) {

        for (int i = 1; i <= espaciosExteriores; i++) {
          System.out.print(" ");
        }

        System.out.print("*");
        for (int i = 1; i < espaciosInternos; i++) {
          System.out.print(" ");
        }

        if (altura>1) {
          System.out.print("*");
        }
        
        System.out.println();
        altura++;
        espaciosExteriores--;
        espaciosInternos+=2;
      } 
      
      espaciosInternos = alturaIntroducida - 3;
      espaciosExteriores = 1;
      altura = 0;

      while (altura < alturaIntroducida / 2) {

        for (int i = 1; i <= espaciosExteriores; i++) {
          System.out.print(" ");
        }

        System.out.print("*");
        for (int i = 1; i < espaciosInternos; i++) {
          System.out.print(" ");
        }
        
        if(altura < alturaIntroducida / 2 - 1) {
          System.out.print("*");
        }
        
        System.out.println();
        altura++;
        espaciosExteriores++;
        espaciosInternos -= 2;
      }     
  } 
}

