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

        int[][] a = Varias.generaArrayBiInt(5, 8, 0, 100);

        Varias.muestraArrayBiInt(a);
        System.out.print("\nFila 2: ");
        ejerciciodel20al28.matematicas.Varias.muestraArrayInt(Varias.filaDeArrayBiInt(a, 2));
        
        System.out.print("\nColumna 6: ");
        ejerciciodel20al28.matematicas.Varias.muestraArrayInt(Varias.columnaDeArrayBiInt(a, 6));
        
        System.out.print("\nCoordenadas del 24 (fila, columna): ");
        ejerciciodel20al28.matematicas.Varias.muestraArrayInt(Varias.coordenadasEnArrayBiInt(a, 24));

        int[][] b = {{11, 10, 9}, {4, 5, 7}, {2, 6, 1}};

        Varias.muestraArrayBiInt(b);
        System.out.println("\nBusca los puntos de silla: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Varias.esPuntoDeSilla(b, i, j)) {
                    System.out.println("fila " + i + ", columna " + j + " -> " + b[i][j]);
                }
            }
        }
        
        

        Varias.muestraArrayBiInt(a);
        System.out.print("\nFila: ");
        int fila = s.nextInt();
        
        System.out.print("Columna: ");
        int columna = s.nextInt();
        
        System.out.print("Dirección (nose/neso): ");
        String direccion = s.next();
        
        System.out.print("\nDiagonal: ");
        ejerciciodel20al28.matematicas.Varias.muestraArrayInt(Varias.diagonal(a, fila, columna, direccion));
    }

}
