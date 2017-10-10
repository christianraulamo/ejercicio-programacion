/**
 * Ejercicio 09
 *
 * @author Christian Amo
 */
 
public class Ejercicio09 {
	
	 // Las constantes se deben declarar antes del main
  static final double pi = 3.141592654;
  // En lugar de definir una constante se podría usar
  // la constante predefinida Math.PI 
  
  public static void main(String[] args) {

    System.out.println("Volumen de un cono");
    System.out.print("Por favor, introduzca la altura (cm): ");
    double h = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca el radio (cm): ");
    double r = Double.parseDouble(System.console().readLine());
    double v = (1.0/3.0) * pi * r * r * h;
    System.out.println("El volumen del cono es de " +  v + " cm3");
  }
}
