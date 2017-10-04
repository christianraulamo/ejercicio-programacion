/**
 * Ejercicio 5
 *
 * @author Christian Amo
 */
 
public class Ejercicio05 {
  public static void main(String[] args) {
    
    int pesetas = 834592;
    double euros = pesetas / 166.386;
    
    System.out.println(pesetas + " pesetas son " + euros + " euros.");
    // Para mostrar dos decimales se puede usar "printf"
    // en lugar de "print" o "println"
    System.out.printf("%d pesetas son %.2f euros.\n", pesetas, euros);
  }
}
