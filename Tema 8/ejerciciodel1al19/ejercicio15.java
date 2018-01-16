package ejerciciodel1al19;

/**
 *
 * @author christian
 */
import ejerciciodel1al19.matematicas.Varia;

public class ejercicio15 {

    public static void main(String[] args) {

        for (int i = 1; i < 1001; i++) {
            if (ejerciciodel1al19.matematicas.Varia.esPrimo(i)) {
                System.out.print(i + "  ");
            }
        }
    }
}
