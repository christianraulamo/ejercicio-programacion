package ejerciciodel1al15;

/**
 *
 * @author christian
 */
import ejerciciodel1al15.matematicas.varia;
import java.util.Scanner;

public class ejercicio17 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long decimal = 0;

        System.out.print("Introduzca un número binario: ");
        int binario = s.nextInt();

        int bits = ejerciciodel1al15.matematicas.varia.digitos(binario);

        for (int i = 0; i < bits; i++) {
            decimal += ejerciciodel1al15.matematicas.varia.digitoN(binario, bits - i - 1) * ejerciciodel1al15.matematicas.varia.potencia(2, i);
        }

        System.out.println(binario + " en binario es " + decimal + " en decimal.");
    }
}
