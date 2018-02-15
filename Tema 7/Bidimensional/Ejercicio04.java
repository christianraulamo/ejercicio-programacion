package ejercicio04;

/**
 *Ejercicio 04
 *
 * @author Christian Raúl Amo Olsson
 */

public class Ejercicio04 {

  public static void main(String[] args) throws InterruptedException {

    int[][] num = new int[4][5];

    int fila;
    int columna;


    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        num[fila][columna] = (int) (Math.random() * 801) + 100;
      }
    }

    int sumaFila;

    for (fila = 0; fila < 4; fila++) {
      sumaFila = 0;

      for (columna = 0; columna < 5; columna++) {
        System.out.printf("%7d   ", num[fila][columna]);
        sumaFila += num[fila][columna];
      }

      Thread.sleep(1000);
      System.out.printf("|%7d\n", sumaFila);
    }

    for (columna = 0; columna < 5; columna++) {
      System.out.print("----------");
    }

    System.out.println("-----------");

    int sumaColumna;
    int sumaTotal = 0;

    for (columna = 0; columna < 5; columna++) {
      sumaColumna = 0;

      for (fila = 0; fila < 4; fila++) {
        sumaColumna += num[fila][columna];
      }

      sumaTotal += sumaColumna;

      Thread.sleep(1000);
      System.out.printf("%7d   ", sumaColumna);
    }
    Thread.sleep(1000);
    System.out.printf("|%7d   ", sumaTotal);
  }
}
