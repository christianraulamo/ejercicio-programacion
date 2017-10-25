/**
 * Ejercicio 23
 *
 * @author Christian Amo
 */
 
public class Ejercicio23 {

  public static void main(String[] args) {

    System.out.println("El proceso terminara cuando la suma de los números sea mayor que 10000.");
    System.out.println("Introduzca numeros:");
    
    int numeroIntroducido;
    int suma = 0;
    int numeroDeElementos = 0;
    
    do {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      suma += numeroIntroducido;
      numeroDeElementos++;
    } while (suma <= 10000);
    
    System.out.println("Ha introducido un total de " + numeroDeElementos + " números.");
    System.out.println("La suma total es " + suma + ".");
    System.out.println("La media es " + suma / numeroDeElementos + ".");
  }
}
