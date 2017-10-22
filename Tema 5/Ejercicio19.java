/**
 * Ejercicio 19
 *
 * @author Christian Amo
 */

public class Ejercicio19 {

  public static void main(String[] args) {
    
    System.out.print("Meta la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    System.out.print("Meta el carácter de relleno: ");
    String relleno = System.console().readLine();
    
    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida-1;
    
    while (altura <= alturaIntroducida) {
      
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      for (i = 1; i < altura * 2; i++) {
        System.out.print(relleno);
      }

      System.out.println();

      altura++;
      espacios--;
    }
  }
}
