package ejerciciosdel29al34;

/**
 * Ejercicio
 *
 * @author christian
 */
import ejerciciosdel29al34.matematicas.Varias;
import java.util.Scanner;

public class ejerciciosdel29al34 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduce el número de filas: ");
        int n = s.nextInt();
        
        System.out.print("Introduce el número de columnas: ");
        int m = s.nextInt();
        
        System.out.print("Ahora introduce el valor mínimo: ");
        int minimo = s.nextInt();
        
        System.out.print("Ahora introduce el valor máximo: ");
        int maximo = s.nextInt();
        
        int[][] x = Varias.generaArrayBiInt(n, m, minimo, maximo); 
        Varias.mostrarArrayBiInt(x);

        System.out.print("Introduce la fila que quiere mostrar: ");
        int fila = s.nextInt();
        int[] array = Varias.filaDeArrayBiInt(x, fila);
        Varias.mostrarArrayBiInt(array);                               
        System.out.println();

        System.out.print("Introduce la columna que quiere mostrar: ");
        int columna = s.nextInt();
        array = Varias.columnaDeArrayBiInt(x, columna);
        Varias.mostrarArrayInt(array);                                           
        System.out.println();

        System.out.print("Introduce el número que quiere buscar en el array: ");
        int numero = s.nextInt();
        System.out.println();
        array = Varias.coordenadasEnArrayBiInt(x, numero);

        System.out.println("Su número está en la posición: ");          
        Varias.mostrarArrayInt(array);
        System.out.println();
        System.out.println("Su número es punto de silla? " + Varias.esPuntoDeSilla(x, numero));  //5

        System.out.print("Introduce la fila desde donde se coge la diagonal: ");
        fila = s.nextInt();
        System.out.print("Introduce la columna desde donde se coge la diagonal: ");
        columna = s.nextInt();
        System.out.print("Introduce la dirección: 'nose' o 'neso'");
        String direccion = s.next();
        array = Varias.diagonal(x, fila, columna, direccion);        
        Varias.mostrarArrayInt(array);
    }

}
