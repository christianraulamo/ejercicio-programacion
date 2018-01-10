/**
 * Ejercicio
 *
 * @author Christian Raúl Amo Olsson
 */
import java.util.Scanner;

public class Ejercicio08 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String[] mes = {
            "Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre",
            "Diciembre"};
    int[] temperatura = new int[12];
    int i, j;

    for (i = 0; i < 12; i++) {
      System.out.print("Introduzca la temperatura media de " + mes[i] + ": ");
      temperatura[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println(" ");
    System.out.print("Enero      |");
    for (i = 0; i < temperatura[0]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + temperatura[0] + "C");
    System.out.println("");
    System.out.print("Febrero    |");

    for (i = 0; i < temperatura[1]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + temperatura[1] + "C");
    System.out.println("");
    System.out.print("Marzo      |");

    for (i = 0; i < temperatura[2]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + temperatura[2] + "C");
    System.out.println("");
    System.out.print("Abril      |");

    for (i = 0; i < temperatura[3]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + temperatura[3] + "C");
    System.out.println("");
    System.out.print("Mayo       |");

    for (i = 0; i < temperatura[4]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + temperatura[4] + "C");
    System.out.println("");
    System.out.print("Junio      |");

    for (i = 0; i < temperatura[5]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + temperatura[5] + "C");
    System.out.println("");
    System.out.print("Julio      |");

    for (i = 0; i < temperatura[6]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + temperatura[6] + "C");
    System.out.println("");
    System.out.print("Agosto     |");

    for (i = 0; i < temperatura[7]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + temperatura[7] + "C");
    System.out.println("");
    System.out.print("Septiembre |");

    for (i = 0; i < temperatura[8]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + temperatura[8] + "C");
    System.out.println("");
    System.out.print("Octubre    |");

    for (i = 0; i < temperatura[9]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + temperatura[9] + "C");
    System.out.println("");
    System.out.print("Noviembre  |");

    for (i = 0; i < temperatura[10]; i++) {
      System.out.print("*");
    }

    System.out.print("| " + temperatura[10] + "C");
    System.out.println("");
    System.out.print("Diciembre  |");

    for (i = 0; i < temperatura[11]; i++) {
      System.out.print("*");
    }
    
    System.out.print("| " + temperatura[11] + "C");
    System.out.println("");
  }
}
