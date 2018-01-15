/**
 * Ejercicio
 *
 * @author Christian Raúl Amo Olsson
 */
import java.util.Scanner;

public class Ejercicio08 {

    static final String RESET = " ";
    static final String INVERSO = "";
    static final String BLANCA = "  ";
    static final String NEGRA = INVERSO + BLANCA + RESET;
    static final String ALFIL = "* ";
    static final String MOVIMIENTOBLANCO = ". ";

    static final String MOVIMIENTONEGRO = INVERSO + MOVIMIENTOBLANCO + RESET;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[][] tablero = new String[9][9];
        int fila;
        int columna;
        String casilla;

        System.out.println("                      ");
        casilla = BLANCA;
        for (fila = 8; fila >= 1; fila--) {
            System.out.print(fila + "   ");
            for (columna = 1; columna <= 8; columna++) {
                if ((fila % 2) == 1) {
                    if ((columna % 2) == 1) {
                        casilla = BLANCA;
                    } else {
                        casilla = NEGRA;
                    }
                } else {
                    if ((columna % 2) == 1) {
                        casilla = NEGRA;
                    } else {
                        casilla = BLANCA;
                    }
                }
                System.out.print(casilla);
                tablero[fila][columna] = casilla;
            }
            System.out.println("  ");
        }
        System.out.println("                      ");
        System.out.println("     a b c d e f g h");

        System.out.print("\nIntroduzca la posición del alfil, por ejemplo d5: ");
        String posicionAlfil = System.console().readLine();
        int columnaAlfil = (int) (posicionAlfil.charAt(0)) - 96;
        int filaAlfil = (int) (posicionAlfil.charAt(1)) - 48;

        System.out.println(posicionAlfil.charAt(0));
        System.out.println(columnaAlfil);
        System.out.println(filaAlfil);

        if ((((filaAlfil % 2) + (columnaAlfil % 2)) % 2) == 0) {
            tablero[filaAlfil][columnaAlfil] = ALFIL;
        } else {
            tablero[filaAlfil][columnaAlfil] = INVERSO + ALFIL + RESET;
        }

        System.out.println("                      ");
        for (fila = 8; fila >= 1; fila--) {
            System.out.print(fila + "   ");
            for (columna = 1; columna <= 8; columna++) {
                if ((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna))
                        && (!((filaAlfil == fila) && (columnaAlfil == columna)))) {
                    if (tablero[fila][columna] == BLANCA) {
                        tablero[fila][columna] = MOVIMIENTOBLANCO;
                    } else {
                        tablero[fila][columna] = MOVIMIENTONEGRO;
                    }
                }
                System.out.print(tablero[fila][columna]);
            }
            System.out.println("  ");
        }
        System.out.println("                      ");
        System.out.println("     a b c d e f g h");
    }
}
