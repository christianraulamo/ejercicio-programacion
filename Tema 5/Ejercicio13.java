/**
 * Ejercicio 13
 *
 * @author Christian Amo
 */


public class Ejercicio13 {
	
	public static void main (String args[]) {
		
	  System.out.println("Meta 10 numeros enteros: ");
	  
	  int positivo = 0;
	  int negativo = 0;
	  
	  for (int i = 0; i < 10; i++) {
		if (Integer.parseInt(System.console().readLine()) < 0) {
		  negativo++;
	     }else{
		  positivo++;
	     }
	   }
	   
	System.out.println("Ha introducido " + positivo + " positivo y " + negativo + " negativo");
	}
}
