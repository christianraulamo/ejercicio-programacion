/**
 * Ejercicio 02
 *
 * @author Christian Amo
 */
 
public class Ejercicio02 {// Clase principal
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    
		if ((hora >= 6) && (hora <= 12)) {
			System.out.println("Buenos dias");
        }
        
		if ((hora >= 13) && (hora <= 20)) {
			System.out.println("Buenos tardes");
        }
		 
		if ((hora >= 21) && (hora < 24)|| ((hora <= 5) && (hora >= 0))) {
			System.out.println("Buenos noches");
        }
        if ((hora >= 24) || (hora < 0)) {
      System.out.println("La hora introducida no es correcta.");
    }
	}
	
}

