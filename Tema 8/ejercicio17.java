package ejerciciodel1al15;

/**
 *
 * @author christian
 */
public class ejercicio17 {

    public static void main(String[] args) {

        long decimal = 0;

        System.out.print("Introduzca un número binario: ");
        long binario = Long.parseLong(System.console().readLine());

        int bits = ejerciciodel1al15.matematicas.varia.digitos(binario);

        for (int i = 0; i < bits; i++) {
            decimal += ejerciciodel1al15.matematicas.varia.digitoN(binario, bits - i - 1) * ejerciciodel1al15.matematicas.varia.potencia(2, i);
        }

        System.out.println(binario + " en binario es " + decimal + " en decimal.");
    }
}
