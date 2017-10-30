/**
 * Ejercicio 37
 *
 * @author Christian Amo
 */
 
public class Ejercicio37 {
  
  public static void main (String args[]) {
    
    System.out.print("Meta un numero: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    
    long numero = numeroIntroducido;
    long volteado = 0;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
      
      int palotes;
    
    while (volteado > 0) {
      palotes = (int)(volteado % 10);
      
      for (int i = 0; i < palotes; i++) {
        System.out.print("|");
      }
      if (volteado > 10) {
        System.out.print(" - ");
      }
      volteado = volteado / 10;
    }
  
  }
}

