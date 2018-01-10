package ejercicio17;

/**
 * Ejercicio
 *
 * @author Christian Raúl Amo Olsson
 */
import java.util.Scanner;

public class Ejercicio17 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] n = new int[10];

    for (int i = 0; i < 10; i++) {
      n[i] = (int) (Math.random() * 381) + 20;
    }

    System.out.println("Array original:");
    System.out.println();
    System.out.print("Indice: ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%4d ", i);
    }
    System.out.println();
    System.out.print("Valor:  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%4d ", n[i]);
    }
    System.out.println();

    boolean existeNumero = false;
    int numeroIntroducido;
    do {
      System.out.println();
      System.out.print("Introduzca uno de los números del array: ");
      numeroIntroducido = s.nextInt();

      for (int elemento : n) {
        if (elemento == numeroIntroducido) {
          existeNumero = true;
        }
      }

      if (!existeNumero) {
        System.out.println("Ese número no se encuentra en el array");
      }
    } while (!existeNumero);

    while (n[0] != numeroIntroducido) {
      int aux = n[9];

      for (int i = 9; i > 0; i--) {
        n[i] = n[i - 1];
      }
      n[0] = aux;
    }

        System.out.println();
    System.out.println("Array resultante:");
    System.out.println();
    System.out.print("Indice: ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%4d ", i);
    }
    System.out.println();
    System.out.print("Valor:  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%4d ", n[i]);
    }
    System.out.println();
  }
}
