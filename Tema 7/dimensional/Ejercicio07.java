package ejercicio07;

/**
 * Ejercicio
 *
 * @author Christian Raúl Amo Olsson
 */
import java.util.Scanner;

public class Ejercicio07 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] num = new int[100];
    int i;

    for (i = 0; i < 100; i++) {
      num[i] = (int) (Math.random() * 21);
      System.out.print(num[i] + " ");
    }

    System.out.println("");
    System.out.print("Introduce un numero entero que quieras buscar (Entre el 0 y el 20): ");
    int numero1 = s.nextInt();
    System.out.print("Introduce otro numero entero que lo cambies por el");
    System.out.print(" numero anteriormente introducido: ");
    int numero2 = s.nextInt();

    for (i = 0; i < 100; i++) {
      if (num[i] == numero1) {
        num[i] = numero2;
        System.out.print("'" + num[i] + "'" + " ");
      } else {
        System.out.print(num[i] + "  ");
      }
    }
  }
}
