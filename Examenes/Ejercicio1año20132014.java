/**
 * 1. Realiza un programa que pinte la letra T por pantalla hecha con asteriscos. El programa pedirá la
   altura. El palo horizontal de la T tendrá una longitud de la mitad (división entera entre 2) de la altura
   más uno.
 *
 * @author Christian Amo
 */
 
public class Ejercicio1año20132014 {
  
  public static void main (String args[]) {
    
    System.out.print("Meta la altura: ");    
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    int altura = 0;
    int i = 0;
    int espaciosInternos = alturaIntroducida - 1;
    int espaciosExteriores = 0;

    
    while (altura < alturaIntroducida / 2 + 1) {
      System.out.print("* ");
      
        altura++;
      }
       
      System.out.println();
      
      espaciosInternos = 0;
      espaciosExteriores = alturaIntroducida / 2;
      altura = 1;
      
      while (altura <= alturaIntroducida - 1) {
        
        for (i = 1; i <= espaciosExteriores; i++) {
          System.out.print(" ");
        }
        
        System.out.println("*");
        
        altura++;

    } 

  }
}
