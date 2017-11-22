package ejercicio22;
/**
 *Ejercicio 
 *
 * @author Christian Raúl Amo Olsson
 */

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
            
        System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
        int longitud = s.nextInt();
        
        int posicionFinal = 12;
        int posicion = 0;
        
        System.out.println("            @");
        for (int i = 1; i < longitud; i++) {
          posicion = (int)(Math.random() * 3) - 1;
          posicionFinal += posicion;
            for (int k = 0; k < posicionFinal; ++k) {
              System.out.print(" ");
            }
        System.out.println("*");
    }
  }
}
