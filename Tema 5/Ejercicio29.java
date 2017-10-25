/**
 * Ejercicio 29
 *
 * @author Christian Amo
 */
 
public class Ejercicio29 {
  
  public static void main(String[] args) {

    System.out.print("Meta un número entero positivo que sea grande: ");
    int numeroGrande = Integer.parseInt(System.console().readLine());

    System.out.print("Meta otro número que sea pequeño: ");
    int numeroPequeno = Integer.parseInt(System.console().readLine());

    System.out.print("Los números enteros positivos menores que " + numeroGrande );
    System.out.println(" que no son divisibles entre " + numeroPequeno + " son los siguientes:");

    int cuenta = 0;
    int suma = 0;

    for (int i = 1; i < numeroGrande; i++) {
      if ((i % numeroPequeno) != 0) {
        System.out.print(i + " ");
      }
    }
  }
}

