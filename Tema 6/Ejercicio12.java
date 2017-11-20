/**
 * Ejercicio 11
 *
 * @author Christian Amo
 */
 
public class Ejercicio12 {

  public static void main(String[] args) 
    throws InterruptedException {

    int linea = 0;
    
    String verde = "\033[32m";
    
    for(int i = 0; i < 90000; i++) {
      System.out.print((char)(Math.random() *93) + 32);
      
      if (linea++ == 1000) {
        linea = 0;
        Thread.sleep(50);
        System.out.println();
        System.out.print(verde + linea);
      }
    }
  }
}
