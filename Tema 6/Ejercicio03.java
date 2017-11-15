/**
 * Ejercicio 03
 *
 * @author Christian Amo
 */
 
public class Ejercicio03 {
  
  public static void main (String args[]) {
    
   System.out.print("La carta es: ");  
    
    int numero = (int)(Math.random()*13) + 1;
       switch (numero) {
        case 1:
         System.out.print("as de ");
         break;
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
         System.out.print(numero + " de ");
         break;
        case 7:
         System.out.print("sota de");
         break;
        case 8:
         System.out.print("caballo de ");
         break;
        case 9:
         System.out.print("rey de ");
         break;
       }
     
      int carta = (int)(Math.random()*4) + 1;
      
      switch (carta) {
        
        case 1:
         System.out.print("espada ");
         break;
        case 2:
         System.out.print("oros ");
         break;
        case 3:
         System.out.print("coronas ");
         break;
        case 4:
         System.out.print("bastos ");
         break;
       }
    
  }
}

