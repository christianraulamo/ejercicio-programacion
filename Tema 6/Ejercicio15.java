/**
 * Ejercicio 15
 *
 * @author Christian Amo
 */

public class Ejercicio15 {
    
    public static void main (String[] args) {
        
        for (int i = 1; i <= 4; i++) {
        int melodia = (int)(Math.random()*7) + 1;
      
      switch (melodia) {
        
        case 1:
         System.out.print(" do");
         break;
        case 2:
         System.out.print(" re");
         break;
        case 3:
         System.out.print(" mi");
         break;
        case 4:
         System.out.print(" fa");
         break;
         case 5:
         System.out.print(" so");
         break;
         case 6:
         System.out.print(" la");
         break;
         case 7:
         System.out.print(" si");
         break;
       }
   }
   System.out.print("|");
        
    }
}
