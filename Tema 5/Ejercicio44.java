/**
 * Ejercicio 45
 *
 * @author Christian Amo
 */
 
public class Ejercicio44 {
  
  public static void main (String args[]) {
    
    System.out.print("Meta un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    System.out.print("Meta la posición donde quiere insertar: ");
    long posicion = Long.parseLong(System.console().readLine());

    System.out.print("Meta el dígito que quiere insertar: ");
    long digito = Long.parseLong(System.console().readLine());

    long numero = numeroIntroducido;

    int longitud = 0;
    
    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);
    
    long parteIzquierda = numeroIntroducido / (long)(Math.pow(10, longitud - posicion + 1));
    parteIzquierda = parteIzquierda * 10 + digito;

    long parteDerecha = numeroIntroducido % (long)(Math.pow(10, longitud - posicion + 1));

    numero = parteIzquierda * (long)(Math.pow(10, longitud - posicion + 1)) + parteDerecha;
    System.out.print("El número resultante es " + numero);
  }
}
