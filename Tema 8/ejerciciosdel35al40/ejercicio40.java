package ejerciciosdel35al40;

/**
 * Ejercicio
 *
 * @author christian
 */
import java.util.Scanner;

public class ejercicio40 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce el valor mínimo del array: ");
        int minimo = s.nextInt();

        System.out.print("Introduce el valor máximo del array: ");
        int maximo = s.nextInt();

        System.out.print("Introduce el tamaño del array: ");
        int tamanyo = s.nextInt();

        int[] array = ejerciciodel20al28.matematicas.Varias.generaArrayInt(tamanyo, minimo, maximo);
        ejerciciodel20al28.matematicas.Varias.mostrarArrayInt(array);

        System.out.println();
        System.out.println("Su array de sietes es: ");
        ejerciciodel20al28.matematicas.Varias.mostrarArrayInt(filtraCon7(array));

    }

//FUNCIONES//
    /**
     * Devuelve un array con todos los números que contengan un siete
     *
     *
     * @param x un array de números enteros
     * @return Devuelve un array con números que tienen 7
     */
    public static int[] filtraCon7(int x[]) {
        int[] siete = new int[x.length];
        boolean aparece = false;
        int contador = 0;
        int resto = 0;
        for (int i = 0; i < x.length; i++) {
            resto = x[i];
            while (resto > 0) {
                if (resto % 10 == 7) {
                    aparece = true;
                }
                resto /= 10;
            }
            if (aparece) {
                siete[contador] = x[i];
                ++contador;
            }
            aparece = false;
        }
        if (contador == 0) {
            siete[0] = -1;
        }
        return siete;
    }
}
