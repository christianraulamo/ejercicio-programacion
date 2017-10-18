/**
 * Ejercicio 15
 *
 * @author Christian Amo
 */


public class Ejercicio15 {
	
	public static void main (String args[]) {
		System.out.print("Meta un número real como base: ");
		double base = Double.parseDouble(System.console().readLine());
		
		System.out.print("Meta un número entero positivo como exponencial: ");
		int exponenteFinal = Integer.parseInt(System.console().readLine());
		
	 double potencia;
	 int exponente;
	 
	  for (int i = 1; i <= exponenteFinal; i++) {
        
      potencia = 1;
      exponente = i;
      
      for (int j = 0; j < exponente; j++) {
        potencia *= base;
      }
      
      System.out.println(base + "^" + i + " = " + potencia);
     }
	 
	}
}

