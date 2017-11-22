/**
 *Ejercicio 19
 * 
 * @author Christian Raúl Amo Olsson
 */

public class Ejercicio19 {

    public static void main(String[] args) {
        
    System.out.println("50 números aleatorios entre -100 y 200:");
    
    int maximo = 0;
    int minimo = 99999 ;
    int media = 0;
    
    for (int i = 1; i <= 50; i++) {
      int numero = (int)(Math.random()* 301) - 100;
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
