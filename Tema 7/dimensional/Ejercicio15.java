

/**
 * Ejercicio 15
 *
 * @author Christian Raúl Amo Olsson
 */
import java.util.Scanner;

public class Ejercicio15 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] mesa = new int[10];
    int comensales = 0;

    System.out.print("mesa: ");

    for (int i = 0; i < 10; i++) {
      mesa[i] = (int) (Math.random() * 4) + 1;
      System.out.printf("%4d ", i + 1);
    }

    System.out.println();
    System.out.print("mesa: ");

    for (int i = 0; i < 10; i++) {
      System.out.printf("%4d ", mesa[i]);
    }
    System.out.println();

    while (comensales > -1) {
      System.out.print("¿Cuántos son? ");
      comensales = s.nextInt();
      
      for (int i = 0; i < 10; i++) {
        if ((mesa[i] + comensales) <= 4) {
          mesa[i] = mesa[i] + comensales;
          i += 10;
        }
      }

      if (comensales > 5) {
        System.out.println("Lo siento, no admitimos grupos de " + comensales + " haga grupos de 4 personas como máximo e intente de nuevo");
      }

      System.out.print("mesa: ");

      for (int i = 0; i < 10; i++) {
        System.out.printf("%4d ", i + 1);
      }

      System.out.println();
      System.out.print("mesa: ");

      for (int i = 0; i < 10; i++) {
        System.out.printf("%4d ", mesa[i]);
      }
      System.out.println();
    }
  }
}
