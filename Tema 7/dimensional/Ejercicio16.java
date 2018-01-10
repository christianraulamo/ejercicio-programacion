package ejercicio16;

/**
 * Ejercicio 16
 *
 * @author Christian Raúl Amo Olsson
 */
import java.util.Scanner;

public class Ejercicio16 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] numero = new int[20];

    for (int i = 0; i < 20; ++i) {
      numero[i] = (int) (Math.random() * 401);
      System.out.printf("%4d ", numero[i]);
    }

    System.out.println();
    System.out.print("¿Que quiere destacar? (1 – multiplos de 5, 2 – multiplos de 7): ");
    int peticion = s.nextInt();

    int mult7 = 0;
    int mult5 = 500;

    if (peticion == 1) {
      for (int i = 0; i < 20; i++) {
        if (numero[i] % 5 == 0) {
          System.out.print(" [" + numero[i] + "] ");
        } else {
          System.out.printf("%4d ", numero[i]);
        }
      }
    }

    if (peticion == 2) {
      for (int i = 0; i < 20; i++) {
        if (numero[i] % 7 == 0) {
          System.out.print("[" + numero[i] + "]");
        } else {
          System.out.printf("%4d ", numero[i]);
        }
      }
    }
  }
}
