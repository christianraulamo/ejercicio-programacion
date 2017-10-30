/**
 * Ejercicio 34
 *
 * @author Christian Amo
 */
 
public class Ejercicio34 {
  
  public static void main (String args[]) {
    
    System.out.print("Meta un número: ");
    long numeroIntroducido1 = Long.parseLong(System.console().readLine());

    System.out.print("Meta otro número: ");
    long numeroIntroducido2 = Long.parseLong(System.console().readLine());


    long numero = numeroIntroducido1;
    long volteado1 = 0;
    int longitud = 0;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado1 = (volteado1 * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } 
    
    numero = numeroIntroducido2;
    long volteado2 = 0;
    
    while (numero > 0) {
      volteado2 = (volteado2 * 10) + (numero % 10);
      numero /= 10;
    } 

    long resultadoPares = 0;
    long resultadoImpares = 0;
    int digito;
    
    for (int i = 0; i < longitud; i++) {

      digito = (int)(volteado1 % 10);

      if ((digito % 2) == 0) {
        resultadoPares = resultadoPares * 10 + digito;
      } else {
        resultadoImpares = resultadoImpares * 10 + digito;
      }

      digito = (int)(volteado2 % 10);

      if ((digito % 2) == 0) {
        resultadoPares = resultadoPares * 10 + digito;
      } else {
        resultadoImpares = resultadoImpares * 10 + digito;
      }

      volteado1 /= 10;
      volteado2 /= 10;
    }
    
    System.out.println("El número formado por los dígitos pares es: " + resultadoPares);
    System.out.println("El número formado por los dígitos impares es: " + resultadoImpares);
  }
}

