package ejercicio08;

/**
 * Ejercicio
 *
 * @author Christian Raúl Amo Olsson
 */
import java.util.Scanner;

public class Ejercicio08 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] num = new int[12];

    System.out.print("Introduce la temperatura media de Enero: ");
    num[0] = s.nextInt();
    System.out.print("Introduce la temperatura media de Febrero: ");
    num[1] = s.nextInt();
    System.out.print("Introduce la temperatura media de Marzo: ");
    num[2] = s.nextInt();
    System.out.print("Introduce la temperatura media de Abril: ");
    num[3] = s.nextInt();
    System.out.print("Introduce la temperatura media de Mayo: ");
    num[4] = s.nextInt();
    System.out.print("Introduce la temperatura media de Junio: ");
    num[5] = s.nextInt();
    System.out.print("Introduce la temperatura media de Julio: ");
    num[6] = s.nextInt();
    System.out.print("Introduce la temperatura media de Agosto: ");
    num[7] = s.nextInt();
    System.out.print("Introduce la temperatura media de Septiembre: ");
    num[8] = s.nextInt();
    System.out.print("Introduce la temperatura media de Octubre: ");
    num[9] = s.nextInt();
    System.out.print("Introduce la temperatura media de Noviembre: ");
    num[10] = s.nextInt();
    System.out.print("Introduce la temperatura media de Diciembre: ");
    num[11] = s.nextInt();

    System.out.print("Enero      |");
    for (int i = 0; i < num[0]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + num[0] + "C");
    System.out.println("");
    System.out.print("Febrero    |");

    for (int i = 0; i < num[1]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + num[1] + "C");
    System.out.println("");
    System.out.print("Marzo      |");

    for (int i = 0; i < num[2]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + num[2] + "C");
    System.out.println("");
    System.out.print("Abril      |");

    for (int i = 0; i < num[3]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + num[3] + "C");
    System.out.println("");
    System.out.print("Mayo       |");

    for (int i = 0; i < num[4]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + num[4] + "C");
    System.out.println("");
    System.out.print("Junio      |");

    for (int i = 0; i < num[5]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + num[5] + "C");
    System.out.println("");
    System.out.print("Julio      |");

    for (int i = 0; i < num[6]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + num[6] + "C");
    System.out.println("");
    System.out.print("Agosto     |");

    for (int i = 0; i < num[7]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + num[7] + "C");
    System.out.println("");
    System.out.print("Septiembre |");

    for (int i = 0; i < num[8]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + num[8] + "C");
    System.out.println("");
    System.out.print("Octubre    |");

    for (int i = 0; i < num[9]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + num[9] + "C");
    System.out.println("");
    System.out.print("Noviembre  |");

    for (int i = 0; i < num[10]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + num[10] + "C");
    System.out.println("");
    System.out.print("Diciembre  |");

    for (int i = 0; i < num[11]; i++) {
      System.out.print("*");
    }
    
    System.out.print("| " + num[11] + "C");
    System.out.println("");
  }
}
