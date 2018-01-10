package ejerciciodel1al15.matematicas;

/**
 *
 * @author christian
 */
public class funciones {

    /**
     *
     * Devuelve verdadero si el número que se pasa como parámetro es capicúa y
     * falso en caso contrario.
     *
     * @param x
     * @return
     */
    public static boolean esCapicua(long x) {
        return x == voltea(x);
    }

    /**
     * Comprueba si un número entero positivo es primo o no. Un número es primo
     * cuando únicamente es divisible entre él mismo y la unidad.
     *
     * @param x un número entero positivo
     * @return  <code>true</code> si el número es primo y <code>false</code> en
     * caso contrario
     */
    public static boolean esPrimo(int x) {

        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     *
     * Devuelve el menor primo que es mayor al número que se pasa como
     * parámetro.
     *
     * @param x
     * @return
     */
    public static int siguientePrimo(int x) {
        while (!esPrimo(x++)) {
        };

        return x;
    }

    /**
     *
     * Dada una base y un exponente devuelve la potencia.
     *
     * @param x
     * @return
     */
    public static double potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }

        if (exponente < 0) {
            return 1 / potencia(base, -exponente);
        }

        int n = 1;

        for (int i = 0; i < Math.abs(exponente); i++) {
            n = n * base;
        }

        return n;
    }

    /**
     * Devuelve el número de dígitos que contiene un número entero
     *
     * @param x un número entero
     * @return la cantidad de dígitos que contiene el número
     */
    public static int digitos(int x) {

        if (x == 0) {
            return 1;
        } else {
            int n = 0;
            while (x > 0) {
                x = x / 10;
                n++;
            }
            return n;
        }
    }

    /**
     *
     * Le da la vuelta a un número.
     *
     * @param x
     * @return
     */
    public static long voltea(long x) {
        if (x < 0) {
            return -voltea(-x);
        }

        long volteado = 0;

        while (x > 0) {
            volteado = (volteado * 10) + (x % 10);
            x = x / 10;
        }

        return volteado;
    }

    /**
     *
     * Devuelve el dígito que está en la posición n de un número entero. Se
     * empieza contando por el 0 y de izquierda a derecha.
     *
     * @param x
     * @return
     */
    public static int digitoN(long x, long n) {
        return digitoN((long) x, n);
    }

    /**
     *
     * Da la posición de la primera ocurrencia de un dígito dentro de un número
     * entero. Si no se encuentra, devuelve -1.
     *
     * @param x
     * @return
     */
    public static int posicionDeDigito(long x, long d) {
        int i;

        for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {
        }

        if (i == digitos(x)) {
            return -1;
        } else {
            return i;
        }
    }

    /**
     *
     * Le quita a un número n dígitos por detrás (por la derecha).
     *
     * @param x
     * @return
     */
    public static long quitaPorDetras(long x, int n) {
        return x / (long) potencia(10, n);
    }

    /**
     *
     * Le quita a un número n dígitos por delante (por la izquierda).
     *
     * @param x
     * @return
     */
    public static long quitaPorDelante(long x, int n) {
        x = pegaPorDetras(x, 1);
        x = voltea(quitaPorDetras(voltea(x), n));
        x = quitaPorDetras(x, 1);
        return x;
    }

    /**
     *
     * Añade un dígito a un número por detrás.
     *
     * @param x
     * @return
     */
    public static boolean pegaPorDetras(int x) {

    }

    /**
     *
     * Añade un dígito a un número por delante.
     *
     * @param x
     * @return
     */
    public static boolean pegaPorDelante(int x) {

    }

    /**
     *
     * Toma como parámetros las posiciones inicial y final dentro de un número y
     * devuelve el trozo correspondiente.
     *
     * @param x
     * @return
     */
    public static boolean trozoDeNumero(int x) {

    }

    /**
     *
     * Pega dos números para formar uno.
     *
     * @param x
     * @return
     */
    public static long juntaNumeros(long x, long y) {
        return (long) (x * potencia(10, digitos(y))) + y;
    }

}
