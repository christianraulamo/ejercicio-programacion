/**
 * Ejercicio 08
 *
 * @author Christian Amo
 */



public class Ejercicio08 {
	
	public static void main (String args[]) {
		
	System.out.println("Tabla de multiplicar:");
	System.out.print("Porfavor introduzca un numero que quieras");
	System.out.println(" que aparezca la tabla de multiplicar");
	System.out.print("del 0 al 10: ");
	int numeroIntroducido = Integer.parseInt(System.console().readLine());
		
     for (int i = 0; i <= 10; i++) {
       System.out.println(numeroIntroducido + " x " + i + " = " + numeroIntroducido * i);
		}
	}
}
