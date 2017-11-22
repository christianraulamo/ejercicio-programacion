package ejercicio23;
/**
 *Ejercicio 
 *
 * @author Christian Raúl Amo Olsson
 */

public class Ejercicio23 {

    public static void main(String[] args) {
        
        System.out.print("La carta es: ");  
        
      for (int i = 1; i <= 5; i++) {
      int carta = (int)(Math.random()*5) + 1;
      
      switch (carta) {
        
        case 1:
         System.out.print("As ");
         break;
        case 2:
         System.out.print("K ");
         break;
        case 3:
         System.out.print("G ");
         break;
        case 4:
         System.out.print("J ");
         break;
        case 5:
         System.out.print("7 ");
         break;
        case 6:
         System.out.print("8 ");
         break;
       }
      }   
  }
}