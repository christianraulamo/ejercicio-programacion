package ejerciciosdel35al40;

/**
 * Ejercicio
 *
 * @author christian
 */
import ejerciciodel1al19.matematicas.Varia;
import ejerciciosdel29al34.matematicas.Varias;
import java.util.Scanner;
public class ejercicio36 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduce el valor mínimo del array: ");
        int minimo = s.nextInt();
        
        System.out.print("Introduce el valor máximo del array: ");
        int maximo = s.nextInt();
        
        System.out.print("Introduce el tamaño del array: ");
        int tamanyo = s.nextInt();
        
        int[][] array = ejerciciosdel29al34.matematicas.Varias.generaArrayBiInt(minimo, maximo, minimo, maximo);
        ejerciciosdel29al34.matematicas.Varias.mostrarArrayInt(array);
        
        System.out.println();
        System.out.println("Su array con números primos es: ");
        ejerciciosdel29al34.matematicas.Varias.columnaDeArrayBiInt(filtraPrimos(array));
    }

//FUNCIONES//
    /**
     * Devuelve un array con todos los números primos que se encuentren en otro
     * array
     *
     *
     * @param x un array que queremos buscar los números primos
     * @return Devuelve un array formado solo de los números primos del array
     * pasado de parámetro
     */
    public static int[] filtraPrimos(int[][] x) {
        int[] primo = new int[x.length];
        int contador = 0;
        
        for (int i = 0; i < x.length; i++) {
            if (ejerciciodel1al19.matematicas.Varia.esPrimo(x[i])) {
                primo[contador] = x[i];
                ++contador;
            }
        }
        if (contador == 0) {
            primo[0] = -1;
        }
        return primo;
    }

}
