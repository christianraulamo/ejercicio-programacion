/**
 * Ejercicio 01
 *
 * @author Christian Amo
 */
 
public class Ejercicio01 {
  public static void main(String[] args) {
	  
	  String dia;

    System.out.print("Por favor, introduzca un día de la semana y le ");
    System.out.print("diré qué asignatura toca a primera hora ese día: ");
    dia = (System.console().readLine()); 
    dia.toLowerCase(); // convierto a minúsculas todas las letras
    
    switch(dia) {
      case "lunes":
        System.out.println("Programación y Bases de Datos");
        break;
      case "martes":
        System.out.print("Sistema Informatico, Lenguaje de Marcas y");
        System.out.println(" Programación");
        break;
      case "miércoles":
        System.out.println("Programación y Base de Datos");
        break;
      case "jueves":
        System.out.println("Entorno de Desarrollo y Lenguaje de Marcas");
        break;
      case "viernes":
        System.out.println("Sistema Informatico y Formación profesional");
        break;
      case "sábado":
        // continúa debajo
      case "domingo":
        System.out.println("¡Ese día no hay clase!");
        break;
      default:
        System.out.println("El día introducido no es correcto.");
    }
  }
}
