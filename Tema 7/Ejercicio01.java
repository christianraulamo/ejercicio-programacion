package ejercicio01;
/**
 *Ejercicio 
 *
 * @author Christian Raúl Amo Olsson
 */

public class Ejercicio01 {
    public static void main(String[] args) {
        
    int[] num;
    num = new int[12];
        
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    
    System.out.print("||");
    for (int i = 0; i < 12; ++i) {
      System.out.print(num[i] + " || ");
    }
        
    }

}