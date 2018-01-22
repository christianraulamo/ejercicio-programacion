package ejerciciodel20al28;

/**
 *
 * @author christian
 */
import ejerciciodel20al28.matematicas.Array;
public class ejercicioDel20Al28 {
  public static void main(String[] args) {
    
    int[] a = Array.generaArrayInt(20, 0, 100);
    
    Array.muestraArrayInt(a);    
    System.out.println("Mínimo: " + Array.minimoArrayInt(a));
    System.out.println("Máximo: " + Array.maximoArrayInt(a));
    System.out.println("Media: " + Array.mediaArrayInt(a));
    
    if (Array.estaEnArrayInt(a, 24)) {
      System.out.println("El 24 está en el array.");
    } else {
      System.out.println("El 24 no está en el array.");
    }
      
    System.out.println("El 24 está en la posición " + Array.posicionEnArrayInt(a, 24));
    
    System.out.print("Array al revés: ");
    Array.muestraArrayInt(Array.volteaArrayInt(a));
    
    System.out.print("Array rotado 3 pasos a la derecha: ");
    Array.muestraArrayInt(Array.rotaDerechaArrayInt(a, 3));
    
    System.out.print("Array rotado 4 pasos a la izquierda: ");
    Array.muestraArrayInt(Array.rotaIzquierdaArrayInt(a, 4));
  }
}
