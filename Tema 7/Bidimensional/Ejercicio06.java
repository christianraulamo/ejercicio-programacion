package ejercicio06;

/**
 * Ejercicio 06
 *
 * @author Christian Raúl Amo Olsson
 */
public class Ejercicio06 {

  public static void main(String[] args) throws InterruptedException {

    int[][] num = new int[6][10];

    int fila;
    int columna;

    boolean repetido;
    int i;
    int j;

    int minimo = Integer.MAX_VALUE;
    int filaMinimo = 0;
    int columnaMinimo = 0;

    int maximo = Integer.MIN_VALUE;
    int filaMaximo = 0;
    int columnaMaximo = 0;

    for (fila = 0; fila < 6; fila++) {
      for (columna = 0; columna < 10; columna++) {
        do {
          num[fila][columna] = (int) (Math.random() * 1001);
          
          repetido = false;
          for (i = 0; i < 10 * fila + columna; i++) {
            if (num[fila][columna] == num[i / 10][i % 10]) {
              repetido = true;
            }
          }
          if (num[fila][columna] < minimo) {
            minimo = num[fila][columna];
            filaMinimo = fila;
            columnaMinimo = columna;
          }
          if (num[fila][columna] > maximo) {
            maximo = num[fila][columna];
            filaMaximo = fila;
            columnaMaximo = columna;
          }
        }while (repetido);
        
      }
    }

    for (fila = 0; fila < 6; fila++) {

      System.out.print("Fila: " + fila);

      for (columna = 0; columna < 10; columna++) {
        System.out.printf("%10d ", num[fila][columna]);

      }
      System.out.println();
    }
    System.out.println();

    System.out.println("El máximo es " + maximo + " y está en la fila " + filaMaximo + ", columna " + columnaMaximo);
    System.out.println("El mínimo es " + minimo + " y está en la fila " + filaMinimo + ", columna " + columnaMinimo);
  }
}
