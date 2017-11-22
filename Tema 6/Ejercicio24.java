package ejercicio24;
/**
 *Ejercicio 
 *
 * @author Christian Raúl Amo Olsson
 */

import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numero = Long.parseLong(s.nextLine()); 
        
    long copia = numero;
    int i = 0;
    int solucion = 0;
        
    while (numero > 0) {
      numero /= 10;
      ++i;
    }
    int resto = (int)(Math.random() * i) + 1;
    
    while (resto > 0) {
      solucion = (int) (copia % 10);
      copia /= 10;
      --resto;
    }
    System.out.print(solucion);
  }
}