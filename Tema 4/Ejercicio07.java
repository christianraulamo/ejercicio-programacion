/**
 * Ejercicio 07
 *
 * @author Christian Amo
 */


public class Ejercicio07 {

  public static void main(String[] args) {

    System.out.println("Este programa calcula la media de tres notas.");
    
    System.out.print("Introduzca la primera nota: ");
    Double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la segunda nota: ");
    Double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la tercera nota: ");
    Double nota3 = Double.parseDouble(System.console().readLine());

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.printf("La media es %.2f\n", media);
  }
}
