/**
 * Ejercicio 09
 *
 * @author Christian Amo
 */

public class Ejercicio09 {
    
    public static void main (String[] args) {
        
        System.out.print("El programa reproducira numeros aleatorios ");
        System.out.print("hasta que alla un 24 y dira cuantos numeros ");
        System.out.println("se han reproducido");
        
        int cuenta = 0;
        int i = 0;
        
        while (i != 24) {
            i = (int)(Math.random() * 100);
            System.out.print(i + " ");
            cuenta++;
        }
        System.out.println(" ");
        System.out.println("Se han generado " + cuenta + " numeros.");        
    }
}
