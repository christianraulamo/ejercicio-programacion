package ejercicio06;

/**
 * Ejercicio
 *
 * @author Christian Raúl Amo Olsson
 */
import java.util.Scanner;

public class Ejercicio06 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] num = new int[15];
    int i;

    for (i = 0; i < 15; i++) {
      System.out.print("Introduce un número entero: ");
      num[i] = s.nextInt();
    }

    System.out.println("");
    System.out.println("Array original:");
    System.out.println("");

    for (i = 0; i < 15; i++) {
      System.out.printf("|%3d ", num[i]);
    }
    System.out.println("|");

    int aux = num[14];

    for (i = 14; i > 0; i--) {
      num[i] = num[i - 1];
    }
    num[0] = aux;

    System.out.println("");
    System.out.println("Array rotado a la derecha una posicion:");
    System.out.println("");

    for (i = 0; i < 15; i++) {
      System.out.printf("|%3d ", num[i]);
    }
    System.out.println("|");

  }
}
