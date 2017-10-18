/**
 * Ejercicio 14
 *
 * @author Christian Amo
 */


public class Ejercicio14 {
	
	public static void main (String args[]) {
		
		System.out.println("Cálculo de potencias");
		System.out.print("Meta la base: ");
		
	  int base = Integer.parseInt(System.console().readLine());
	  
	    System.out.print("Meta el exponente (positivo): ");
	    
	  int exponente = Integer.parseInt(System.console().readLine());
	  
	  double potencia = 1;
	  if (exponente == 0) {
      potencia = 1;
    }
    
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia *= base;
      }
    }
    
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia *= base;
      }
      
      potencia = 1/potencia;
    }

    System.out.println(base + "^" + exponente + " = " + potencia);
		
	}
}

