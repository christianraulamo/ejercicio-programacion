/**
 * Ejercicio 11
 *
 * @author Christian Amo
 */

public class Ejercicio11 {
	
	public static void main (String args[]) {
	  System.out.print("Meta un numero entero: ");
	  int numeroIntroducido = Integer.parseInt(System.console().readLine());
	  
	  for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
		  
	  System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
	   }
	}
}

