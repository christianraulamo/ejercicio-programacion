/**
 * Ejercicio 14
 *
 * @author Christian Amo
 */
 
public class Ejercicio14 {
    
  public static void main (String args[]) {

    int numero;
    int intentos = 4;
    int cuenta = 0;
    int numeroPensado;
    int limiteInferior = 0;
    int limiteSuperior = 100;
    
    do {
      numero = (int)(Math.random()* (limiteSuperior - limiteInferior) + limiteInferior) ;
      System.out.print("El numero que pensaste es " + numero + "? (si = 1 y no = 2): ");
      numeroPensado = Integer.parseInt(System.console().readLine());
      
      switch(numeroPensado) {
          case 1:
            System.out.print("Enhorabuena el numero es el correcto");
            break; 
          case 2:
            System.out.println("Lo siento, su numero no es el correcto");
            System.out.println("Le queda " + intentos + " intentos");
            System.out.print("El numero es mayor o menor (Mayor = 1 y Menor = 2): ");
            int numeroReducido = Integer.parseInt(System.console().readLine());
            
            if (numeroReducido == 1) {
                limiteInferior = numero + 1;
            }
            if (numeroReducido == 2) {
                limiteSuperior = numero - 1;
            }
             
            
            System.out.println("El limite inferior es : " + limiteInferior);
            System.out.println("El limite superior es : " + limiteSuperior);
            break;
        }
        
        intentos --;
        
        }while ((intentos == 0) || (numeroPensado == 2));
    
   
  }
}
