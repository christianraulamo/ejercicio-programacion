/**
 * Ejercicio 18
 *
 * @author Christian Amo
 */


public class Ejercicio18 {

  public static void main(String[] args) {
    
    int primerNumero;
    int segundoNumero;
    
    do {
      System.out.print("Mete un número entero: ");
      primerNumero = Integer.parseInt(System.console().readLine());
      System.out.print("Mete otro número entero distinto al anterior: ");
      segundoNumero = Integer.parseInt(System.console().readLine());
      
      if(primerNumero == segundoNumero) {
        System.out.println("Los números introducidos no son válidos, deben ser distintos.");
      }
    } while (primerNumero == segundoNumero);
    
    if (primerNumero > segundoNumero) {
      int aux = primerNumero;
      primerNumero = segundoNumero;
      segundoNumero = aux;
    }
    
    for(int i = primerNumero; i <= segundoNumero; i += 7) {
      System.out.print(i + " ");
    }
    
    System.out.println();
  }
}
