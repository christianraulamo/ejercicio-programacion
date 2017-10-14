/**
 * Ejercicio 04
 *
 * @author Christian Amo
 */

public class S04Ejercicio04 {
  public static void main(String[] args) {

    int sueldoSemanal;

    System.out.print("Introduzca el numero de horas que has trabajado en la semana: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    if (horasTrabajadas < 40) {
      sueldoSemanal = 12 * horasTrabajadas;
    } 
    else {
      sueldoSemanal = (40 * 12) + ((horasTrabajadas - 40) * 16);    
    }
    System.out.println("El sueldo semanal que le corresponde es de " + sueldoSemanal + " euros");
  }
}
