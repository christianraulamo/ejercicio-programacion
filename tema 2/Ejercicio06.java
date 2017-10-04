/**
 * Ejercicio 6
 *
 * @author Christian Amo
 */
 
 public class Ejercicio06 {
  public static void main(String[] args) {

    double baseImponible = 35.25;

    System.out.printf("Base imponible %8.2f\n", baseImponible);
    System.out.printf("IVA            %8.2f\n", (baseImponible * 0.32));
    System.out.printf("-----------------------\n");
    System.out.printf("Total          %8.2f\n", (baseImponible * 1.32));
  }
}
