/**
 * Ejercicio05
 *
 * @author Christian Amo
 */

public class Ejercicio05 {// Clase principal
  public static void main(String[] args) {
    
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    
    System.out.println("Lunes         Martes        Miercoles     jueves        Viernes");
    System.out.println("---------------------------------------------------------------");
    System.out.printf("%-13s      %-13s      %-13s      %-13s      %-13s\n",  rojo + "Progr", naranja + "Siste", rojo + "Progr", morado + "Entor", naranja + "Siste");
    System.out.printf("%-13s      %-13s      %-13s      %-13s      %-13s\n",  rojo + "Progr", naranja + "Siste", rojo + "Progr", morado + "Entor", naranja + "Siste");
    System.out.printf("%-13s      %-13s      %-13s      %-13s      %-13s\n",  rojo + "Progr", naranja + "Siste", rojo + "Progr", morado + "Entor", naranja + "Siste");  
    System.out.printf("%-13s      %-13s      %-13s      %-13s      %-13s\n",  verde + "Bases", blanco + "Lengu", verde + "Bases", blanco + "Lengu", azul + "Forma"); 
    System.out.printf("%-13s      %-13s      %-13s      %-13s      %-13s\n",  verde + "Bases", rojo + "Progr", verde + "Bases", blanco + "Lengu", azul + "Forma"); 
    System.out.printf("%-13s      %-13s      %-13s      %-13s      %-13s\n",  verde + "Bases", rojo + "Progr", verde + "Bases", blanco + "Lengu", azul + "Forma"); 
  }
}
