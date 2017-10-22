/**
 * Ejercicio 10
 *
 * @author Christian Amo
 */


public class Ejercicio10 {

  public static void main(String[] args) {
    
    double numeros = 0;
    double numeroIntroducido = 0;
    double suma = 0;

    System.out.println("El programa calcula la media de solo numeros positivos.");
    System.out.println("Introduzca numeros (se para introduciendo un número negativo):");

    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      numeros++;
      suma += numeroIntroducido;
    }
    
    System.out.println("La media de los números positivos introducidos es " + (suma - numeroIntroducido)/ (numeros - 1));

  }
}
