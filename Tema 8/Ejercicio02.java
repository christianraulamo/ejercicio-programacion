package ejercicio02;

/**
 * Ejercicio
 *
 * @author Christian Raúl Amo Olsson
 */
import java.util.Scanner;

public class Ejercicio02 {

  public static void main(String[] args) throws InterruptedException {
    Scanner s = new Scanner(System.in);

    int[][] num = new int[4][5];

    int fila;
    int columna;

    System.out.println("Introduzca los números (enteros) en el array");

    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        System.out.print("Fila " + fila + ", columna " + columna + ": ");
        num[fila][columna] = s.nextInt();
      }
    }
    
    int sumaFila;
    
    for (fila = 0; fila < 4; fila++) {
      sumaFila = 0;
      
      for (columna = 0; columna < 5; columna++) {
        System.out.printf("%7d   ", num[fila][columna]);
        sumaFila += num[fila][columna];
      }
      
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
      
      System.out.printf("%7d   ", sumaColumna);
    }
    System.out.printf("|%7d   ", sumaTotal);
  }
}
