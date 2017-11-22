package ejercicio25;
/**
 *Ejercicio 
 *
 * @author Christian Raúl Amo Olsson
 */

public class Ejercicio25 {
    public static void main(String[] args) {
        
      for (int i = 1; i < 100; i++) {
      int numero =(int)(Math.random()*191) +10;
      
      int j = 2;
      
      while (numero % j != 0) {
      ++j;
      }
      if (numero == j) {
        System.out.print("#" + numero + "# ");
      } else 
          if ((numero % 5 )== 0) {
        System.out.print("[" + numero + "] ");
      } else {
        System.out.print(numero + " ");
      }
    }
      
    }

}
