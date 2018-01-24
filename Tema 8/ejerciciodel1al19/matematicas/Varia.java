package ejerciciodel1al19.matematicas;

/**
 *
 * @author christian
 */
public class Varia {

    /**
     * Devuelve verdadero si el número que se pasa como parámetro es capicúa y
     * falso en caso contrario.
     *
     * @param x número del que se quiere saber si es capicúa
     * @return verdadero si el número que se pasa como parámetro es capicúa y
     * falso en caso contrario
     */
    public static boolean esCapicua(long x) {
        return x == voltea(x);
    }

    /**
     * Devuelve verdadero si el número que se pasa como parámetro es primo y
     * falso en caso contrario.
     *
     * @param x número del que se quiere saber si es capicúa
     * @return verdadero si el número que se pasa como parámetro es capicúa y
     * falso en caso contrario
     */
    public static boolean esCapicua(int x) {
        return esCapicua((long) x);
    }

    /**
     * Devuelve verdadero si el número que se pasa como parámetro es primo y
     * falso en caso contrario.
     *
     * @param x número del que se quiere saber si es primo
     * @return verdadero si el número que se pasa como parámetro es primo y
     * falso en caso contrario
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
     * Devuelve el menor primo que es mayor al número que se pasa como
     * parámetro.
     *
     * @param x un número entero
     * @return el menor primo que es mayor al número que se pasa como parámetro
     */
    public static int siguientePrimo(int x) {
        while (!esPrimo(++x)) {
        }

        return x;
    }

    /**
     * Dada una base y un exponente, devuelve la potencia.
     *
     * @param base base de la potencia
     * @param exponente exponente de la potencia
     * @return número resultante de elevar la base a la potencia indicada
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
     * Cuenta el número de dígitos de un número entero.
     *
     * @param x número al que se le quieren contar los dígitos
     * @return número de dígitos que tiene el número que se pasa como parámetro
     */
    public static int digitos(long x) {
        if (x < 0) {
            x = -x;
        }

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
     * Cuenta el número de dígitos de un número entero.
     *
     * @param x número al que se le quieren contar los dígitos
     * @return número de dígitos que tiene el número que se pasa como parámetro
     */
    public static int digitos(int x) {
        return digitos((long) x);
    }

    /**
     * Le da la vuelta a un número.
     *
     * @param x número al que se le quiere dar la vuelta
     * @return número volteado (al revés)
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
     * Le da la vuelta a un número.
     *
     * @param x número al que se le quiere dar la vuelta
     * @return número volteado (al revés)
     */
    public static int voltea(int x) {
        return (int) voltea((long) x);
    }

    /**
     * Devuelve el dígito que está en la posición n de un número entero. Se
     * empieza contando por el 0 y de izquierda a derecha.
     *
     * @param x número entero
     * @param n posición dentro del número <code>x</code>
     * @return dígito que está en la posición n del número <code>x</code>
     * empezando a contar por el 0 y de izquierda a derecha
     */
    public static int digitoN(long x, int n) {
        x = voltea(x);

        while (n-- > 0) {
            x = x / 10;
        }

        return (int) x % 10;
    }

    /**
     * Devuelve el dígito que está en la posición n de un número entero. Se
     * empieza contando por el 0 y de izquierda a derecha.
     *
     * @param x número entero
     * @param n posición dentro del número <code>x</code>
     * @return dígito que está en la posición n del número <code>x</code>
     * empezando a contar por el 0 y de izquierda a derecha
     */
    public static int digitoN(int x, int n) {
        return digitoN((long) x, n);
    }

    /**
     * Da la posición de la primera ocurrencia de un dígito dentro de un número
     * entero. Si no se encuentra, devuelve -1.
     *
     * @param x número entero
     * @param d dígito a buscar dentro del número
     * @return posición de la primera ocurrencia del dígito dentro del número o
     * -1 si no se encuentra
     */
    public static int posicionDeDigito(long x, int d) {
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
     * Da la posición de la primera ocurrencia de un dígito dentro de un número
     * entero. Si no se encuentra, devuelve -1.
     *
     * @param x número entero
     * @param d dígito a buscar dentro del número
     * @return posición de la primera ocurrencia del dígito dentro del número o
     * -1 si no se encuentra
     */
    public static int posicionDeDigito(int x, int d) {
        return posicionDeDigito((long) x, d);
    }

    /**
     * Le quita a un número n dígitos por detrás (por la derecha).
     *
     * @param x número entero
     * @param n número de dígitos que se le van a quitar
     * @return número inicial <code>x</code> con <code>n</code> dígitos menos
     * quitados de la derecha
     */
    public static long quitaPorDetras(long x, int n) {
        return x / (long) potencia(10, n);
    }

    /**
     * Le quita a un número n dígitos por detrás (por la derecha).
     *
     * @param x número entero
     * @param n número de dígitos que se le van a quitar
     * @return número inicial <code>x</code> con <code>n</code> dígitos menos
     * quitados de la derecha
     */
    public static int quitaPorDetras(int x, int n) {

        return (int) quitaPorDetras((long) x, n);
    }

    /**
     * Le quita a un número n dígitos por delante (por la izquierda).
     *
     * @param x número entero
     * @param n número de dígitos que se le van a quitar
     * @return número inicial <code>x</code> con <code>n</code> dígitos menos
     * quitados de la izquierda
     */
    public static long quitaPorDelante(long x, int n) {
        x = pegaPorDetras(x, 1);
        x = voltea(quitaPorDetras(voltea(x), n));
        x = quitaPorDetras(x, 1);
        return x;
    }

    /**
     * Le quita a un número n dígitos por delante (por la izquierda).
     *
     * @param x número entero
     * @param n número de dígitos que se le van a quitar
     * @return número inicial <code>x</code> con <code>n</code> dígitos menos
     * quitados de la izquierda
     */
    public static int quitaPorDelante(int x, int n) {
        return (int) quitaPorDelante((long) x, n);
    }

    /**
     * Añade un dígito a un número por detrás (por la derecha).
     *
     * @param x número entero
     * @param d dígito que se le va a pegar por la derecha
     * @return número inicial <code>x</code> con el dígito <code>d</code> pegado
     * por la derecha
     */
    public static long pegaPorDetras(long x, int d) {
        return juntaNumeros(x, d);
    }

    /**
     * Añade un dígito a un número por detrás (por la derecha).
     *
     * @param x número entero
     * @param d dígito que se le va a pegar por la derecha
     * @return número inicial <code>x</code> con el dígito <code>d</code> pegado
     * por la derecha
     */
    public static int pegaPorDetras(int x, int d) {
        return (int) pegaPorDetras((long) x, d);
    }

    /**
     * Añade un dígito a un número por delante (por la izquierda).
     *
     * @param x número entero
     * @param d dígito que se le va a pegar por la izquierda
     * @return número inicial <code>x</code> con el dígito <code>d</code> pegado
     * por la izquierda
     */
    public static long pegaPorDelante(long x, int d) {
        return juntaNumeros(d, x);
    }

    /**
     * Añade un dígito a un número por delante (por la izquierda).
     *
     * @param x número entero
     * @param d dígito que se le va a pegar por la izquierda
     * @return número inicial <code>x</code> con el dígito <code>d</code> pegado
     * por la izquierda
     */
    public static int pegaPorDelante(int x, int d) {
        return (int) pegaPorDelante((long) x, d);
    }

    /**
     * Toma como parámetros las posiciones inicial y final dentro de un número y
     * devuelve el trozo correspondiente.
     *
     * @param x número entero
     * @param inicio posición inicial
     * @param fin posición final
     * @return trozo de número compuesto por todos los dígitos que van desde la
     * posición inicial a la posición final incluyendo ambos
     */
    public static long trozoDeNumero(long x, int inicio, int fin) {
        int longitud = digitos(x);
        x = quitaPorDelante(x, inicio);
        x = quitaPorDetras(x, longitud - fin - 1);
        return x;
    }

    /**
     * Toma como parámetros las posiciones inicial y final dentro de un número y
     * devuelve el trozo correspondiente.
     *
     * @param x número entero
     * @param inicio posición inicial
     * @param fin posición final
     * @return trozo de número compuesto por todos los dígitos que van desde la
     * posición inicial a la posición final incluyendo ambos
     */
    public static int trozoDeNumero(int x, int inicio, int fin) {
        return (int) trozoDeNumero((long) x, inicio, fin);
    }

    /**
     * Pega dos números para formar uno solo.
     *
     * @param x trozo que se pegará por la izquierda
     * @param y trozo que se pegará por la derecha
     * @return número compuesto de los trozos <code>x</code> e <code>y</code>
     */
    public static long juntaNumeros(long x, long y) {
        return (long) (x * potencia(10, digitos(y))) + y;
    }

    /**
     * Pega dos números para formar uno solo.
     *
     * @param x trozo que se pegará por la izquierda
     * @param y trozo que se pegará por la derecha
     * @return número compuesto de los trozos <code>x</code> e <code>y</code>
     */
    public static int juntaNumeros(int x, int y) {
        return (int) (juntaNumeros((long) x, (long) y));
    }

    /**
     * Pasa un número de base decimal a base octal
     *
     * @param numero: número que queremos pasar a octal
     * @return Devuelve el número en octal.
     */
    public static int octal(int numero) {
        int resto = 0;
        int octal = 0;
        while (numero > 0) {
            resto = numero % 8;
            octal = resto + (octal * 10);
            numero /= 8;
        }
        return ejerciciodel1al19.matematicas.Varia.voltea(octal);
    }

    /**
     * Pasa un número de base octal a base decimal
     *
     * @param numero: número que queremos pasar a decimal
     * @return Devuelve el número en decimal.
     */
    public static int octalDec(int numero) {
        int suma = 0;

        int copia = numero;
        int resto = 0;
        for (int i = 0; i < ejerciciodel1al19.matematicas.Varia.digitos(copia); ++i) {
            resto = numero % 10;

            suma += ((ejerciciodel1al19.matematicas.Varia.potencia(8, i)) * resto);
            numero /= 10;
        }
        return suma;
    }

    /**
     * Pasa un número de base hexadecimal a base decimal
     *
     * @param numero: número que queremos pasar a decimal
     * @return Devuelve el número en decimal.
     */
    public static int hexaDec(int numero) {
        int suma = 0;

        int copia = numero;
        int resto = 0;
        for (int i = 0; i < digitos(copia); ++i) {
            resto = numero % 10;

            suma += ((potencia(16, i)) * resto);
            numero /= 10;
        }
        return suma;
    }

    /**
     * Pasa un número de base decimal a base hexadecimal
     *
     * @param numero: número que queremos pasar a hexadecimal
     * @return Devuelve el número en hexadecimal.
     */
    public static String hexadecimal(int numero) {
        int resto = 0;
        String[] fin = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F",};
        String hexadecimal = "";
        String numeroFinal = "";
        int i = 0;
        while (numero > 0) {
            resto = numero % 16;
            while (i < resto) {
                ++i;
            }
            hexadecimal += fin[i];
            numero /= 16;
            i = 0;
        }
        for (int j = hexadecimal.length() - 1; j >= 0; --j) {
            numeroFinal = numeroFinal + hexadecimal.charAt(j);
        }
        return numeroFinal;
    }

    /**
     * Pasa un número de base decimal a base binaria
     *
     * @param numero: número que queremos pasar a binario
     * @return Devuelve el número en binario
     */
    public static int binario(int numero) {
        int binario = 0;
        int contador = 0;
        int copia = numero;
        while (numero % 2 == 0) {
            contador++;
            numero /= 2;
        }

        while (copia > 0) {

            binario = (copia % 2) + binario * 10;
            copia /= 2;
        }
        binario = voltea(binario);
        for (int i = 0; i < contador; ++i) {
            binario *= 10;
        }
        return binario;
    }

    /**
     * Pasa un número de base binaria a base decimal
     *
     * @param numero: número que queremos pasar a decimal
     * @return Devuelve el número en decimal.
     */
    public static int decimal(int numero) {
        int suma = 0;

        int copia = numero;
        int resto = 0;
        for (int i = 0; i < digitos(copia); ++i) {
            resto = numero % 10;

            suma += ((potencia(2, i)) * resto);
            numero /= 10;
        }
        return suma;
    }
}
