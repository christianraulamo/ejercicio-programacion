/**
 * Ejercicio
 *
 * @author Christian Raúl Amo Olsson
 */
import java.util.Scanner;

public class Ejercicio11 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] num = new int[10];
    int[] primo = new int[10];
    int[] noPrimo = new int[10];
    int contadorPrimo = 0;
    int contadorNoprimo = 0;

    for (int i = 0; i < 10; ++i) {
      System.out.print("Introduce un numero: ");
      num[i] = s.nextInt();
      
      int j = 2;
      
      while (num[i] % j != 0) {
        ++j;
      }
      
      if (num[i] == j) {
        primo[contadorPrimo] = num[i];
        
        contadorPrimo++;
      } else {
        noPrimo[contadorNoprimo] = num[i];
        
        contadorNoprimo++;
      }
    }
    System.out.println();
    System.out.print("Indice: ");
    
    for (int i = 0; i < 10; i++) {
      System.out.printf("%4d ", i);
    }
    
    System.out.println();
    System.out.print("Valor:  ");
    
    for (int i = 0; i < contadorPrimo; ++i) {
      System.out.printf("%4d ", primo[i]);
    }
    
    for (int i = 0; i < contadorNoprimo; ++i) {
      System.out.printf("%4d ", noPrimo[i]);
    }
  }
}
