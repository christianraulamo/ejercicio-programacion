package ejercicio13;

/**
 * Ejercicio
 *
 * @author Christian Raúl Amo Olsson
 */
 
 import java.util.Scanner;
public class Ejercicio13 {

  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);

    System.out.println("100 numeros aleatorios entre 0 y el 500 (sin decimales):");
    

    int maximo = 0;
    int minimo = 99999;
    int[] numero = new int[100];
    int i;

    for (i = 0; i < 100; i++) {
      numero[i] = (int) (Math.random() * 501);
      System.out.print(numero[i] + " ");
    

    if (numero[i] > maximo) {
      maximo = numero[i];
    }
    if (numero[i] < minimo) {
      minimo = numero[i];
    }
}

    System.out.println();
    System.out.println();

    System.out.print("¿Que quiere destacar? (1 minimo, 2 maximo): ");
    int opcion = s.nextInt();
    
    for (i = 0; i < 100; i++) {
        if (opcion == 1) {
            if (numero[i] == maximo) {
            System.out.print("**" + numero[i] + "**" + " ");
            } else {
            System.out.print(numero[i] + "  ");
            }
        }
        if (opcion == 2) {
            if (numero[i] == minimo) {
            System.out.print("**" + numero[i] + "**" + " ");
            } else {
            System.out.print(numero[i] + "  ");
            }
        }
    }

    
    System.out.println();
    System.out.print(numero[i]);

  }
}
