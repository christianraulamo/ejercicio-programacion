/**
 * Ejercicio 05
 *
 * @author Christian Amo
 */
 
public class Ejercicio05 {
  
  public static void main (String args[]) {
    
    System.out.println("20 números aleatorios entre 100 y 199 (sin decimales):");
    
    int maximo = 0;
    int minimo = 99999 ;
    int media = 0;
    
    for (int i = 1; i <= 50; i++) {
      int numero = (int)(Math.random()*99) + 100;
      System.out.print( numero + " ");
      media += numero / 50;
      
      if (numero > maximo) {
        maximo = numero;
      }
      if (numero < minimo) {
        minimo = numero;
      }
    }
    System.out.println();
    System.out.println();
    
    System.out.println("La media es: " + media);
    System.out.println("El maximo es: " + maximo);
    System.out.println("El minimo es: " + minimo);
    
  }
}
