/**
 * Ejercicio 35
 *
 * @author Christian Amo
 */
 
public class Ejercicio35 {
  
  public static void main (String args[]) {
    
    System.out.println("La altura tiene que ser igual o mayor de 3 e impar");
    System.out.print("Meta la altura de la X: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    int altura = 1;
    int i = 0;
    int espaciosInternos = alturaIntroducida - 1;
    int espaciosExteriores = 0;

    if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
      System.out.print("Datos incorrectos. Debe meter una altura impar mayor o igual a 3");
    } else {

      while (altura < alturaIntroducida / 2 + 1) {
        
        for (i = 1; i <= espaciosExteriores; i++) {
          System.out.print(" ");
        }
        
        System.out.print("*");
        for (i = 1; i < espaciosInternos; i++) {
          System.out.print(" ");
        }
        System.out.print("*");
        
        System.out.println();
        altura++;
        espaciosExteriores++;
        espaciosInternos -= 2;      
      } 
      
      espaciosInternos = 0;
      espaciosExteriores = alturaIntroducida / 2;
      altura = 1;
      while (altura <= alturaIntroducida / 2 + 1) {
        
        for (i = 1; i <= espaciosExteriores; i++) {
          System.out.print(" ");
        }
        
        System.out.print("*");
        for (i = 1; i < espaciosInternos; i++) {
          System.out.print(" ");
        }
        
        if(altura>1) {
          System.out.print("*");
        }
        
        System.out.println();
        altura++;
        espaciosExteriores--;
        espaciosInternos+=2;
      } 
    }
  }
}
