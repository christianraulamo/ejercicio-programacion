/**
 * Ejercicio 21
 *
 * @author Christian Amo
 */

public class Ejercicio21 {
  
  public static void main (String args[]) {
    System.out.println("Meta números enteros.");
    System.out.println("Se termina metiendo un numero negativo.");

    int numeroIntroducido;
    int numeroDeElementos = 0;
    int sumaImpares = 0;
    int numeroDeElementosImpares = 0;
    int maximoPar = 0;
    
    do {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido >= 0) {
        numeroDeElementos++;
        
        if ((numeroIntroducido % 2) == 1) { 
          sumaImpares += numeroIntroducido;
          numeroDeElementosImpares++;
          
        } else{ 
          
          if (numeroIntroducido > maximoPar)
            maximoPar = numeroIntroducido;
        }
      }
    } while (numeroIntroducido >= 0);

    System.out.println("Ha metido " + numeroDeElementos + " números");
    System.out.println("La media de los impares es " + sumaImpares/numeroDeElementosImpares);
    System.out.println("El máximo de los pares es " + maximoPar);
  }
}
