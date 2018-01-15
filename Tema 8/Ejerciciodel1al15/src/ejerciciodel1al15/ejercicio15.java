package ejerciciodel1al15;

/**
 *
 * @author christian
 */
public class ejercicio15 {

    public static void main(String[] args) {

        for (int i = 1; i < 1001; i++) {
            if (ejerciciodel1al15.matematicas.varia.esPrimo(i)) {
                System.out.print(i + "  ");
            }
        }
    }
}
