/**
 * Ejercicio 11
 *
 * @author Christian Amo
 */
 
public class Ejercicio12 {

  public static void main(String[] args) 
    throws InterruptedException {

    int linea = 0;
    
    System.out.print("#008000");
    
    for(int i = 0; i < 90000; i++) {
      System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
      
      if (linea++ == 1000) {
        linea = 0;
        Thread.sleep(50);
        System.out.println();
      }
    }
  }
}
