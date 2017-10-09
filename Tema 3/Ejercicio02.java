
/**
 * Ejercicio 02
 *
 * @author Christian Amo
 */
 
public class Ejercicio02 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduce la cantidad de euros que quieres convertir: ");
    double euros = Double.parseDouble(System.console().readLine());

    double pesetas = (euros * 166.386);
    
    System.out.print(euros + " euros son " + pesetas + " pesetas.");
  }
}
