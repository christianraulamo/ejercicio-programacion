/**
 * Ejercicio 17
 * 
 * @author christian
 */
 
public class Ejercicio17 {

    public static void main(String[] args) {
        
    System.out.print("Por favor, introduzca la altura de la pecera: ");
    int altura = Integer.parseInt(System.console().readLine());

    System.out.print("Ahora introduzca la anchura: ");
    int anchura = Integer.parseInt(System.console().readLine());

    int posicion = 0;

    int posicionDelPez = (int)(Math.random()*(altura - 2)*(anchura - 2));

    for(int i = 0; i < anchura; i++) {
      System.out.print("*");
    }
    
    System.out.println();  

    for(int i = 2; i < altura; i++) {
      System.out.print("*"); 
      
      for(int j = 2; j < anchura; j++) {
          
        if (posicion == posicionDelPez) {
          System.out.print("&");
        } else {
          System.out.print(" ");
        }
        
        posicion++;
      } 
      System.out.println("*"); 
    } 
      
    for(int i = 0; i < anchura; i++) {
      System.out.print("*");
    }
  }
}
