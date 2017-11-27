package ejercicio04;
/**
 *Ejercicio 
 *
 * @author Christian Raúl Amo Olsson
 */


public class Ejercicio04 {
    public static void main(String[] args) {
    
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];   
    
    int i;
    
    for (i = 0; i < 20; i++) {
        numero[i] = (int)(Math.random()*101);
        cuadrado[i] = numero[i] * numero[i];
        cubo[i] = cuadrado[i] * numero[i];
      }
      
    System.out.println();
    System.out.print("A continuación, muestra el contenido de los tres arrays ");
    System.out.println("dispuesto\n en tres columnas");
    System.out.println();
    System.out.println("  n  │   n²  │    n³");
    System.out.println("───────────────");
    for (i = 0; i < 20; i++) {
        System.out.printf("%4d │ %5d │%8d\n", numero[i], cuadrado[i], cubo[i]);
      }
  }
}