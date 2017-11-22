package ejercicio21;
/**
 *Ejercicio 21
 *
 * @author Christian Raúl Amo Olsson
 */

public class Ejercicio21 {

    public static void main(String[] args) {
        
    System.out.println("Las monedas son:");  
    
    for (int i = 1; i <= 5; i++) {
    int numero = (int)(Math.random()*8) + 1;
    
       switch (numero) {
        case 1:
         System.out.print("1 centimo ");
         break;
        case 2:
         System.out.print("2 centimos ");
         break;
        case 3:
         System.out.print("5 centimos ");
         break;
        case 4:
         System.out.print("10 centimos ");
         break;
        case 5:
         System.out.print("20 centimos ");
         break;
        case 6:
         System.out.print("50 centimos ");
         break;
        case 7:
         System.out.print("1 Euro ");
         break;
        case 8:
         System.out.print("2 Euros ");
         break;
       }
     
      int carta = (int)(Math.random()*2) + 10;
      
      switch (carta) {
        
        case 10:
         System.out.println("Cara ");
         break;
        case 11:
         System.out.println("Cruz ");
         break;
        
       }
    }
    
  }
}