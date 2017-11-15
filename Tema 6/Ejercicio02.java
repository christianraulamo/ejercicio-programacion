/**
 * Ejercicio 02
 *
 * @author Christian Amo
 */
 
public class Ejercicio02 {
  
  public static void main (String args[]) {
    
    System.out.print("La carta es: ");  
    
    int numero = (int)(Math.random()*13) + 1;
       switch (numero) {
        case 1:
         System.out.print("A de ");
         break;
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
         System.out.print(numero + " de ");
         break;
        case 11:
         System.out.print("J de");
         break;
        case 12:
         System.out.print("Q de ");
         break;
        case 13:
         System.out.print("K de ");
         break;
       }
     
      int carta = (int)(Math.random()*4) + 1;
      
      switch (carta) {
        
        case 1:
         System.out.print("picas ");
         break;
        case 2:
         System.out.print("corazones ");
         break;
        case 3:
         System.out.print("diamantes ");
         break;
        case 4:
         System.out.print("tréboles ");
         break;
       }
  }
}

