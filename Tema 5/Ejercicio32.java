/**
 * Ejercicio 32
 *
 * @author Christian Amo
 */
 
public class Ejercicio32 {
  
  public static void main (String args[]) {
    
     System.out.print("Meta un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    long numero = numeroIntroducido;
    long volteado = 0;
    int longitud = 0;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    }

    System.out.print("Dígitos pares: ");

    int digito;
    int sumaPares = 0;
    
    for (int i = 0; i < longitud; i++) {

      digito = (int)(volteado % 10);

      if ((digito % 2) == 0) {
        System.out.print(digito + " ");
        sumaPares += digito;
      }

      volteado /= 10;
    }
    
    System.out.println("\nSuma de los dígitos pares: " + sumaPares);
  }
}
