package ejerciciodel20al28;

/**
 *
 * @author christian
 */
import ejerciciodel20al28.matematicas.Varias;
public class ejercicioDel20Al28 {
  public static void main(String[] args) {
    
    int[] a = Varias.generaArrayInt(20, 0, 100);
    
    Varias.muestraArrayInt(a);    
    System.out.println("Mínimo: " + Varias.minimoArrayInt(a));
    System.out.println("Máximo: " + Varias.maximoArrayInt(a));
    System.out.println("Media: " + Varias.mediaArrayInt(a));
    
    if (Varias.estaEnArrayInt(a, 24)) {
      System.out.println("El 24 está en el array.");
    } else {
      System.out.println("El 24 no está en el array.");
    }
      
    System.out.println("El 24 está en la posición " + Varias.posicionEnArrayInt(a, 24));
    
    System.out.print("Array al revés: ");
    Varias.muestraArrayInt(Varias.volteaArrayInt(a));
    
    System.out.print("Array rotado 3 pasos a la derecha: ");
    Varias.muestraArrayInt(Varias.rotaDerechaArrayInt(a, 3));
    
    System.out.print("Array rotado 4 pasos a la izquierda: ");
    Varias.muestraArrayInt(Varias.rotaIzquierdaArrayInt(a, 4));
  }
}
