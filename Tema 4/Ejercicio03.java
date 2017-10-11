/**
 * Ejercicio 03
 *
 * @author Christian Amo
 */
 


public class Ejercicio03 {
	
	public static void main (String args[]) {
		System.out.print("Por favor, introduzca un numero del 1 al 7: ");   
		 
		int dia = Integer.parseInt(System.console().readLine());
    
    String nombreDelDia;
		
		switch (dia) {
      case 1:
        nombreDelDia = "lunes";
        break;
        
      case 2:
        nombreDelDia = "martes";
        break;
        
      case 3:
        nombreDelDia = "miercoles";
        break;
        
      case 4:
        nombreDelDia = "jueves";
        break;
        
      case 5:
        nombreDelDia = "viernes";
        break;
        
      case 6:
        nombreDelDia = "sabado";
        break;
        
      case 7:
        nombreDelDia = "domingo";
        break;
        
      default:
        nombreDelDia = "no existe ese dia";
    }

    System.out.println("Dia " + dia + ": " + nombreDelDia);
	}
	
}

