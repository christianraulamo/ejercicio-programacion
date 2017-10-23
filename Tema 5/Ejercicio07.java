/**
 * Ejercicio 07
 *
 * @author Christian Amo
 */


public class Ejercicio07 {

  public static void main(String[] args) {
    
    int intentos = 4;
    int numeroIntroducido;
    boolean acertado = false;
    
    do {
      System.out.print("Meta la contrasena de la caja de seguridad: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido == 1604) {
        acertado = true;
      } else {
        System.out.println("Contrasena incorrecta");
      }
      
      intentos--;
  
    } while((intentos > 0) && (!acertado));
    
    if (acertado) {
      System.out.println("Ha abierto la caja fuerte.");
    } else {
      System.out.println("Lo siento, ha agotado las 4 oportunidades.");
    }
  }
}
