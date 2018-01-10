package ejercicio12;

/**
 * Ejercicio
 *
 * @author Christian Raúl Amo Olsson
 */
import java.util.Scanner;

public class Ejercicio12 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] num = new int[10];

    int i;

    for (i = 0; i < 10; ++i) {
      System.out.print("Introduce un número: ");
      num[i] = s.nextInt();
    }

    System.out.println();
    System.out.println("El array original: ");
    System.out.print("Indice: ");

    for (i = 0; i < 10; i++) {
      System.out.printf("%4d ", i);
    }
    System.out.println();
    System.out.print("Valor:  ");

    for (i = 0; i < 10; i++) {
      System.out.printf("%4d ", num[i]);
    }

    System.out.println();
    System.out.println();

    System.out.print("Introduce la posición inicial: ");
    int inicial = s.nextInt();

    System.out.print("Introduce la posición final: ");
    int finalPos = s.nextInt();

    while ((((inicial >= finalPos) && (inicial > 9)) || (inicial < 0) || (finalPos > 9) || (finalPos < 0))) {
      System.out.print("Introduce la posición inicial: ");
      inicial = s.nextInt();
      System.out.print("Introduce la posición final: ");
      finalPos = s.nextInt();
    }

    System.out.println(); 
    System.out.println("El array final: ");
    System.out.print("Indice: ");

    for (i = 0; i < 10; i++) {
      System.out.printf("%4d ", i);
    }

    System.out.println();
    System.out.print("Valor:    ");
    System.out.print(num[9] + " ");

    for (i = 0; i < inicial; ++i) {
      System.out.printf("%4d ", num[i]);
    }

    for (i = inicial + 2; i <= finalPos; ++i) {
      System.out.printf("%4d ", num[i - 1]);
    }

    System.out.printf("%4d ", num[inicial]);

    for (i = finalPos; i < 9; i++) {
      System.out.printf("%4d ", num[i]);
    }
  }
}
