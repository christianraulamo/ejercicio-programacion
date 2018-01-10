package ejercicio09;

/**
 * Ejercicio
 *
 * @author Christian Raúl Amo Olsson
 */
import java.util.Scanner;

public class Ejercicio09 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] numero = new int[8];
    int par = 0;
    int impar = 0;
    int i;

    for (i = 0; i < 8; i++) {
      System.out.print("Introduzca un numero: ");
      numero[i] = s.nextInt();
    }
    System.out.println();
    for (i = 0; i < 8; i++) {
      if (numero[i] % 2 == 0) {
        System.out.println(numero[i] + " Par");
      } else {
        System.out.println(numero[i] + " Impar");
      }
    }
       
  }
}
