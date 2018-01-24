package ejerciciosdel35al40;

/**
 * Ejercicio
 *
 * @author christian
 */
import java.util.Scanner;

public class ejercicio35 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Meta un numero: ");
        int numero = s.nextInt();
        System.out.println(convierteEnPalotes(numero));
    }

//FUNCIONES//
    /**
     * L función convierte el número n al sistema de palotes y lo devuelve en
     * una cadena de caracteres.
     *
     *
     * @param n el número que se pasa a palotes.
     * @return Devuelve un string del numero que se pasa a palotes.
     */
    public static String convierteEnPalotes(int n) {
        String palotes = "";
        n = ejerciciodel1al19.matematicas.Varia.voltea(n);

        int resto = 0;
        while (n > 0) {
            resto = n % 10;
            for (int i = 0; i < resto; i++) {
                palotes += "|";
            }
            n /= 10;
            palotes += "-";
        }
        palotes = palotes.substring(0, palotes.length() - 1);
        return palotes;
    }
}
